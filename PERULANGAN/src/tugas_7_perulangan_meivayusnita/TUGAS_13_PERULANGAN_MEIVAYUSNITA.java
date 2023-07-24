package tugas_7_perulangan_meivayusnita;
import java.util.Scanner;
public class TUGAS_13_PERULANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    public static void main(String[] args) {
      String nama;
      int jumlah;
      
        System.out.print("Nama : ");
        nama = masukkan.nextLine();
        System.out.print("Jumlah huruf i : ");
        jumlah = masukkan.nextInt();
        
        for (int i = 1; i <= jumlah; i++){
            System.out.print("i ");
        }
    }
   
}
