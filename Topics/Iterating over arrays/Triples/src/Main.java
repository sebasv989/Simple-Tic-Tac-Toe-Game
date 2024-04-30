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

        int count = 0;

        for (int j = 0; j < size - 2; j++) {

            if (arr[j] + 1 == arr[j + 1] && arr[j + 1] + 1 == arr[j + 2]) {
                count++;
            }
        }

        System.out.println(count);
    }
}