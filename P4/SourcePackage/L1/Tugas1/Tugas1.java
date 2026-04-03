import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double makan, transport, belanja, total, PersenMakan, PersenTransport, PersenBelanja;

        System.out.println(" Masukkan biaya makan:");
        makan = input.nextDouble();

        System.out.println(" Masukkan biaya transport:");
        transport  = input.nextDouble();

        System.out.println(" Masukkan biaya belanja");
        belanja = input.nextDouble();

        total = makan + transport + belanja;
        PersenMakan = ( makan * 100) / total;
        PersenTransport = ( transport * 100 ) / total;
        PersenBelanja = ( belanja *100)/ total;

        System.out.println("\n Total" + total);
        System.out.println(" Presentase: ");
        System.out.println(" Makan = " + PersenMakan + "%");
        System.out.println(" Transport = " + PersenTransport + "%");
        System.out.println(" Belanja = " + PersenBelanja + "%");

     
    }
    
}
