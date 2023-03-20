import java.util.InputMismatchException;
import java.util.Scanner;
class Valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int n;
        int error = 0;
        System.out.print("Enter no. of inputs: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                a[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                error++;
            }
            sc.nextLine();
        }
        System.out.println("Invalid Integers = " + error);
        System.out.println("Valid Integers = " + (n - error));

        sc.close();
    }
}
