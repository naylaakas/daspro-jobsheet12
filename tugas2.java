import java.util.Scanner;
public class tugas2 {

    static int i;
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return (0);
        }
        else {
        return n + penjumlahanRekursif(n - 1);
        }
    }
    static String cara(int n, int i, String deret) {
        if (i == n) {
            deret += i;
            return cara(n, i + 1, deret);
        } 
        else if (i > n){
            return deret + " = ";
        }
        else {
            deret += i + " + ";
            return cara(n, i + 1, deret);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilanagan n: ");
        int bilangan = sc.nextInt();

        String hasil = cara(bilangan, 1, "");
        int total = penjumlahanRekursif(bilangan);
        System.out.println(hasil + total);
    }
}
