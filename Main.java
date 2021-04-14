package javaapplication1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int pilih,cobalagi;

        do{        
            cd niken = new cdd();

            Scanner input = new Scanner(System.in);

            System.out.println("########++++++++++########");
            System.out.println("         RENTAL CD"        );
            System.out.println("########++++++++++########");
            System.out.println("");
            System.out.print("Masukkan Judul Film\t: ");
            niken.judul=input.nextLine();
            System.out.print("Masukkan Publisher\t: ");
            niken.publisher=input.nextLine();
            System.out.print("Masukkan Aktor\t\t: ");
            niken.aktor=input.nextLine();
            System.out.print("Masukkan Sutradara\t: ");
            niken.sutradara=input.nextLine();
            
            System.out.println("           Kategori"     );
            System.out.println("########++++++++++########");
            System.out.println("1. Semua Umur\n2. Dewasa\n3. Remaja\n4. Anak-Anak");
            System.out.println("########++++++++++########");
            System.out.print("Masukkan pilihan anda\t: ");
            pilih=input.nextInt();

            switch(pilih){
                case 1:
                    niken.kategori="Semua Umur";
                    break;
                case 2:
                    niken.kategori="Dewasa";
                    break;
                case 3:
                    niken.kategori="Remaja";
                    break;
                case 4:
                    niken.kategori="Anak-Anak";
                    break;
                default:
                    System.out.println("Pilihan Anda Tidak Ada");
                    return;
            }
            System.out.print("Stok Film\t\t: ");
            niken.stok=input.nextInt();
            System.out.println("\n");
            System.out.println("=########++++++++++########");
            System.out.println("         DAFTAR FILM       ");
            System.out.println("=########++++++++++########");
            
            System.out.println("Judul Film\t: "+niken.judul);
            System.out.println("Sutradara\t: "+niken.sutradara);
            System.out.println("Aktor Film\t: "+niken.aktor);
            System.out.println("Publisher\t: "+niken.publisher);
            System.out.println("Kategori\t: "+niken.kategori);
            System.out.println("Jumlah Stok\t: "+niken.stok);

            System.out.println("########++++++++++########");
            System.out.println("       TERIMA KASIH       ");
            System.out.println("########++++++++++########");
            System.out.println("\n");
            System.out.println("Mau Coba Lagi?\nKetik [1] untuk Ya dan Ketik [2] untuk Tidak");
            System.out.print("Masukkan pilihan anda: ");
            cobalagi=input.nextInt();
            }while(cobalagi<2);
    }
}
