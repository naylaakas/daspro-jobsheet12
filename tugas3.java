import java.util.Scanner;
public class tugas3 {

    static boolean isPrima(int n, int i) {
        if (i * i > n) {
            return true;
        }
        else  if (n % i == 0) {
            return false;
        }
        else {
            return isPrima(n, i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();
        if (isPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima");
        }
        else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}