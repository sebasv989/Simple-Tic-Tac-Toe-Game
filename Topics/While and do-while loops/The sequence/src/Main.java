import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int size = scanner.nextInt();
        int i = 0;
        int highestDivisor = 0;

        while (i < size) {

            int element = scanner.nextInt();

            if (element % 4 == 0 && highestDivisor < element){
                highestDivisor = element;
            }
            i++;
        }
        System.out.println(highestDivisor);
        scanner.close();
    }
}
