import java.util.Scanner;
public class Latihan1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, hobi; int usia; double tinggi;

        System.out.print(" Input nama: ");
        nama = input.nextLine();
        System.out.print(" Input Umur: ");
        usia = input.nextInt();
        System.out.print(" Input Tinggi: ");
        tinggi = input.nextDouble();
        input.nextLine();   
        System.out.print(" Input Hobi: ");
        hobi = input.nextLine();

        System.out.println(" Nama: " + nama);
        System.out.println(" Umur: " + usia);
        System.out.println(" Tinggi: " + tinggi);
        System.out.println(" Hobi: " + hobi);
    }
}
