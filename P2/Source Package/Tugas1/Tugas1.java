import java.util.Scanner;


public class Tugas1 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Form Data Mahasiswa ===");
            
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

           
            System.out.print("Masukkan Umur: ");
            int usia = input.nextInt();

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