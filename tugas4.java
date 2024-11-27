import java.util.Scanner;
public class tugas4 {

    static int hitungMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        }
        else {
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int bulan = sc.nextInt();
        int jumlahPasangan = hitungMarmut(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);
    }
}
