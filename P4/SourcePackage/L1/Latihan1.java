import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalpertemuan, hadir;
        double presensi, tugas, uts, uas, total;

        System.out.print("Masukan jumlah pertemuan :");
        totalpertemuan = input.nextInt();

        System.out.print("Masukan jumlah hadir :");
        hadir = input.nextInt();

        presensi = ((double) hadir / totalpertemuan) * 100;

        System.out.print("Masukan nilai tugas :");
        tugas = input.nextDouble();

        System.out.print("Masukan nilai uts :");
        uts = input.nextDouble();

        System.out.print("Masukan nilai uas :");
        uas = input.nextDouble();

        total = (0.10 * presensi) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        System.out.println("Presensi :" + presensi);
        System.out.println("tugas :" + tugas);
        System.out.println("uts :" + uts);
        System.out.println("uas :" + uas);
        System.out.println("total :" + total);
    }
}



