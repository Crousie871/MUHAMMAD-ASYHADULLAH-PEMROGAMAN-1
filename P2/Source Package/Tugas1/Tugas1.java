import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Form Data Mahasiswa ===");
            
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            int usia = 0;
            boolean inputBerhasil = false;

            while (!inputBerhasil) {
                try {
                    System.out.print("Masukkan Umur: ");
                    usia = input.nextInt();
                    
                    if (usia < 0) {
                        System.out.println("Kesalahan: Umur tidak boleh negatif.");
                    } else {
                        inputBerhasil = true;
                        input.nextLine(); 
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Kesalahan: Harap masukkan angka yang valid untuk umur.");
                    input.next(); 
                }
            }

            System.out.print("Masukkan Universitas: ");
            String universitas = input.nextLine();

            System.out.print("Masukkan Jurusan/Prodi: ");
            String jurusan = input.nextLine();

            System.out.println("\n--------------------");
            System.out.println("Informasi Mahasiswa:");
            System.out.println("Nama        : " + nama);
            System.out.println("Umur        : " + usia + " tahun");
            System.out.println("Universitas : " + universitas);
            System.out.println("Jurusan     : " + jurusan);
            System.out.println("--------------------");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan sistem: " + e.getMessage());
        }
    }
}