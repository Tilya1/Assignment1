import java.util.Scanner;

public class Task7 {

    public static void reverseRead(Scanner sc, int n) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverseRead(sc, n - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseRead(sc, n);
        System.out.println();
        sc.close();
    }
}
