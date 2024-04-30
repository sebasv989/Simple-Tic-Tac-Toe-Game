import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int[] arr = new int[scanner.nextInt()];
        int divsibleBy6 = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 6 == 0){
                divsibleBy6 += arr[i];
            }
        }
        System.out.println(divsibleBy6);
    }
}