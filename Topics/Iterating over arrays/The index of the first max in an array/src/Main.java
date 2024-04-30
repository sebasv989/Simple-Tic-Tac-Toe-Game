import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];


        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        int maxIndex = 0;

        for (int j = 0; j < size; j++) {

            if (nums[j] > nums[maxIndex]) {
                maxIndex = j;
            }

        }

        System.out.println(maxIndex);
    }
}
