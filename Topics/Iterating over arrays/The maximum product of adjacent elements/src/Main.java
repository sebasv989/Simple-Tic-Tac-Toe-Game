import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {

            arr[i] = scanner.nextInt();

        }

        int maxProduct = arr[0] * arr[1];

        for (int j = 1; j < size; j++) {

            if (maxProduct < arr[j - 1] * arr[j]) {

                maxProduct = arr[j - 1] * arr[j];

            }

        }
        System.out.println(maxProduct);
    }
}