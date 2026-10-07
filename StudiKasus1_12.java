import java.util.Scanner;

/**
 * StudiKasus1_12
 */
public class StudiKasus1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaCup=18000;
        int brpCup;
        int totBelanja;
        int harga;
        double potongan;
        double diskon=0.1;
        System.out.print("Beli berapa cup       : ");
        brpCup = sc.nextInt();
        totBelanja = hargaCup*brpCup;
        System.out.print("Uang yang dimiliki    : Rp.");
        harga = sc.nextInt();
        System.out.println("Total pembelian       : Rp."+totBelanja);
        if (totBelanja >= 100000){
            System.out.println("Potongan harga          : Rp."+(int)(totBelanja*diskon));
            potongan = totBelanja*diskon;
        }else {
            System.out.println("Potongan harga         : Rp.0");
            potongan = 0;
        }
        int totAkhir = (int)(totBelanja-potongan);
        System.err.println("Total pembayaran       : Rp."+(int)(totBelanja-potongan));
        if (harga >= totAkhir){
            System.err.println("Kembalian           : Rp."+(int)(harga-totAkhir));
        }else {
            System.err.println("Uang tidak cukup, kurang Rp."+(int)(totAkhir-harga));
        }
        
    }
    
}