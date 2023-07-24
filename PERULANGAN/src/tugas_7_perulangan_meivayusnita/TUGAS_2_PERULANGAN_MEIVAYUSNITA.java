package tugas_7_perulangan_meivayusnita;
import java.util.Scanner;
public class TUGAS_2_PERULANGAN_MEIVAYUSNITA {
static Scanner masukkan = new Scanner (System.in); 
    public static void main(String[] args) {
         
        int jumlahSiswa;                   
       
       System.out.print("Jumlah Siswa = ");
       jumlahSiswa= masukkan.nextInt();
       
        for (int i = 1; i <= jumlahSiswa ; i++) {
            System.out.println(i+"."+"Nama Siswa "+i+" =");        }
        
    }    
}
