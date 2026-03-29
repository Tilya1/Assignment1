import java.util.Scanner;

public class Task2 {

    public static void readArray(Scanner sc, int[] arr, int i) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        readArray(sc, arr, i + 1);
    }

    public static int sum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        readArray(sc, arr, 0);
        double avg = (double) sum(arr, 0) / n;
        System.out.println(avg);
        sc.close();
    }
}
