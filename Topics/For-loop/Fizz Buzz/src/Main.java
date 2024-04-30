import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int front = scanner.nextInt();
        int back = scanner.nextInt();

        for (int i = front; i <= back; i++) {

            if (i % 15 == 0) {

                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {

                System.out.println("Fizz");

            } else if (i % 5 == 0) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}