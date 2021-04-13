package mod2;
import java.util.*;
public class inputData extends DVD{
    Scanner input = new Scanner (System.in);
    int seleksi;
    
    void data(){
        System.out.println("");
        System.out.println("================================================");
        System.out.println("                RENTAL DVD                      ");
        System.out.println("================================================");
        DVD judul = new DVD();
        System.out.println("Judul             : ");
        judul.name= input.nextLine();
                
        DVD aktor = new DVD();
        System.out.println("Aktor             : ");
        aktor.name= input.nextLine();
                
        DVD sutradara = new DVD();
        System.out.println("Sutradara         : ");
        sutradara.name= input.nextLine();
                
        DVD publisher = new DVD();
        System.out.println("Publisher         : ");
        publisher.name= input.nextLine();
                
        DVD kategori = new DVD();
        System.out.println("Kategori    :");
        System.out.println("1. Semua umur");
        System.out.println("2. Dewasa");
        System.out.println("3. Remaja");
        System.out.println("4. Anak-anak");
        System.out.println("Masukkan Pilihan  : ");
        seleksi = input.nextInt();
        
        switch (seleksi){
            case 1:
                kategori.name = "semua umur";
                break;
            case 2:
                kategori.name = "Dewasa";
                break;
            case 3:
                kategori.name = "Remaja";
                break;
            case 4:
                kategori.name = "Anak-anak";
                break;
        }
        DVD stok = new DVD();
        System.out.println("Stok              : ");
        stok.stok= input.nextInt();
        input.nextLine();
        System.out.println("");
        judul.Judul();
        aktor.Aktor();
        sutradara.sutradara();
        publisher.publisher();
        kategori.kategori();
        stok.stok();
            }   
    }
        
