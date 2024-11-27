import java.util.Scanner;
public class Percobaan2 {
    
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        }
        else { 
            return (x * hitungPangkat(x, y - 1));
        }
    }  
    static String cara(int x, int y, String deret) {
        if (y == 0) {
            return deret + "1 = ";
        } 
        else {
            deret += x + "x";
            return cara(x, y - 1, deret);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        
        String  hasil = cara(bilangan, pangkat, "");
        int total = hitungPangkat(bilangan, pangkat);
        System.out.println(hasil + total);
    }
}
