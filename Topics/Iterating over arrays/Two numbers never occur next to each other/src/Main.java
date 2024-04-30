import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        boolean checker = true;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int j = 0; j < arr.length - 1; j++) {

            if (arr[j] == n && arr[j + 1] == m || arr[j + 1] == n && arr[j] == m) {

                checker = false;
                break;

            }
        }
        System.out.println(checker);
    }
}
