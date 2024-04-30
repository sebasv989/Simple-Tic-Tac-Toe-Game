import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int sum = 0;

        while (scanner.hasNextInt()){
            int input = scanner.nextInt();
            sum += input;

            if (input == 0)break;
        }

        System.out.println(sum);
    }
}