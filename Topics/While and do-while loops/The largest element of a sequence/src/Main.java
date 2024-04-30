import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int high = 0;
        while (scanner.hasNextInt()){
            int current = scanner.nextInt();

            if (current > high){
                high = current;
            }
        }
        System.out.println(high);
    }
}