package mod2;
import  java.util.*;

public class Mod2 {
    public static void main(String[] args) {
        inputData  data = new inputData();
        Scanner input = new Scanner(System.in);
        int pilih = 1;
        
        while (pilih == 1) {            
        data.data();
        System.out.println("\nMengulang lagi ? ( 1 untuk Ya dan 0 untuk Tidak )");
        System.out.print("Masukkan pilihan : ");
        pilih = input.nextInt();
            input.nextLine();
            if (pilih != 1) {
            pilih = 0;
            System.out.println("Terimakasih telah berkunjung");
        }    
    }
    }
}