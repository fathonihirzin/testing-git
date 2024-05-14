import java.util.Scanner;

class Barang {
    String nama;
    int harga;
    int beli;


}


public class StudyCase {

    public static int hitung(int a, int b){
        int resutl = a*b;
        return resutl;
    }

    public static void main(String[] args) {
        Barang barang = new Barang();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Barang           : ");
        barang.nama = sc.nextLine();

        System.out.print("Harga Barang          : ");
        barang.harga = sc.nextInt();

        System.out.print("Jumlah yang dibeli    : ");
        barang.beli = sc.nextInt();

        sc.close();

        int total = hitung(barang.harga, barang.beli);

        System.out.println("_________________________");

        System.out.println("Total Harga         : Rp." + total);

        System.out.println();
        System.out.println();

        
    }

    
}
