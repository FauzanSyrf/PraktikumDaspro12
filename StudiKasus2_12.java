import java.util.Scanner;

/**
 * StudiKasus2_12
 */
public class StudiKasus2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama mahasiswa: ");
        String nama= sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String kegiatan= sc.nextLine();
        if (kegiatan.equalsIgnoreCase("BELMAWA")||
            kegiatan.equalsIgnoreCase("BAKORMA")||
            kegiatan.equalsIgnoreCase("MANDIRI")){
                System.out.print("Jumlah dokumen yang diupload: ");
                int dokumen= sc.nextInt();
                if (dokumen <4){
                    int kurang= 4-dokumen;
                    System.out.println("Dokumen tidak lengkap (kurang "+kurang+" dokumen) dana penghargaan tidak diberikan");
                }else {
                    System.out.print("Peringkat juara: ");
                    int juara= sc.nextInt();
                        if (juara >= 1 && juara <=3){
                            System.out.println("Dapat memperoleh dana penghargaan");
                        }else {
                            System.out.println("Tidak dapat memperoleh dana penghargaan");
                        }       
                    }
            
        }    
    }
}
  
