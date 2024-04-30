import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {


        int[] copy = new int[arr.length];
        int newIndex = steps % arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (newIndex >= arr.length){
                newIndex = 0;
            }
            copy[newIndex] = arr[i];
            newIndex++;

        }
        for (int j = 0; j < copy.length; j++) {
            arr[j] = copy[j];
        }


    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}