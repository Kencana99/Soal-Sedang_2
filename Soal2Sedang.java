import java.util.Scanner;
public class Soal2Sedang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tinggi tabung (cm):");
        double tinggi = scanner.nextDouble();
        System.out.println("Masukkan jari-jari alas tabung (cm) :");
        double jariJari = scanner.nextDouble();
        double phi = Math.PI; //bisa atau 3.14
        double volume = phi * jariJari * jariJari * tinggi;

        System.out.println("Hasil");
        System.out.println("Volume tabung adalah :" +volume + " cm3");

    }
}
