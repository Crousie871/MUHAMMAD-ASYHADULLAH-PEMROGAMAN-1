import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double makan, transport, belanja, total, PersenMakan, PersenTransport, PersenBelanja;

        System.out.println(" Hari ke 1");
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

        double makan2, transport2, belanja2, total2, PersenMakan2, PersenTransport2, PersenBelanja2;

        System.out.println(" Hari ke 2");
        System.out.println(" Masukkan biaya makan:");
        makan2 = input.nextDouble();

        System.out.println(" Masukkan biaya transport:");
        transport2  = input.nextDouble();

        System.out.println(" Masukkan biaya belanja");
        belanja2 = input.nextDouble();

        total2 = makan2 + transport2 + belanja2;
        PersenMakan2 = ( makan2 * 100) / total2;
        PersenTransport2 = ( transport2 * 100 ) / total2;
        PersenBelanja2 = ( belanja2 *100)/ total2;

        System.out.println("\n Total" + total2);
        System.out.println(" Presentase: ");
        System.out.println(" Makan = " + PersenMakan2 + "%");
        System.out.println(" Transport = " + PersenTransport2 + "%");
        System.out.println(" Belanja = " + PersenBelanja2 + "%");

        double makan3, transport3, belanja3, total3, PersenMakan3, PersenTransport3, PersenBelanja3;
        System.out.println(" Hari ke 3");
        System.out.println(" Masukkan biaya makan:");
        makan3 = input.nextDouble();

        System.out.println(" Masukkan biaya transport:");
        transport3 = input.nextDouble();

        System.out.println(" Masukkan biaya belanja");
        belanja3 = input.nextDouble();

        total3 = makan3 + transport3 + belanja3;
        PersenMakan3 = ( makan3 * 100) / total3;
        PersenTransport3 = ( transport3 * 100 ) / total3;
        PersenBelanja3 = ( belanja3 *100)/ total3;

        System.out.println("\n Total" + total3);
        System.out.println(" Presentase: ");
        System.out.println(" Makan = " + PersenMakan3 + "%");
        System.out.println(" Transport = " + PersenTransport3 + "%");
        System.out.println(" Belanja = " + PersenBelanja3 + "%");


     
    }
    
}
