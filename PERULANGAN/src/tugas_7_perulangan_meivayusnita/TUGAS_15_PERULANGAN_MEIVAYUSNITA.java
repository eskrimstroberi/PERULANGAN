
package tugas_7_perulangan_meivayusnita;
import java.util.Scanner;
import java.util.Random;
public class TUGAS_15_PERULANGAN_MEIVAYUSNITA {
    static Scanner masukkan = new Scanner (System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
     int acak, tebak;
        
        acak = rand.nextInt(10)+1; 
     do{
         System.out.print("Masukkan tebakkan anda = ");
         tebak=masukkan.nextInt();
         
         if(tebak<acak){
             System.out.println("Tebakkan anda lebih kecil");
         }
         else if (tebak<acak){
             System.out.println("Tebakkan anda lebih besar");
         }
         else{
             System.out.println("TEBAKKAN ANDA BENAR, HOREE !");
         }
     }
         while (acak!=tebak);
     
    }
    }
    



      
     
             
