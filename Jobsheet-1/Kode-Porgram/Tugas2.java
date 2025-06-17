import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==========================");
            System.out.println("Menu Perhitungan Kubus");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolume(sc);
                    break;
                case 2:
                    hitungLuasPermukaan(sc);
                    break;
                case 3:
                    hitungKeliling(sc);
                    break;
                case 4:
                    System.out.println("Terima kasih! Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);

        sc.close();
    }

    public static void hitungVolume(Scanner sc){
        System.out.print("Masukkan panjang rusuk kubus: ");
        double rusuk = sc.nextDouble();
        double volume = Math.pow(rusuk, 3);
        System.out.printf("Volume kubus dengan panjang rusuk %.2f adalah %.2f%n", rusuk, volume);
    }

    public static void hitungLuasPermukaan(Scanner sc){
        System.out.print("Masukkan panjang rusuk kubus: ");
        double rusuk = sc.nextDouble();
        double luasPermukaan = 6 * Math.pow(rusuk, 2);
        System.out.printf("Luas permukaan kubus dengan panjang rusuk %.2f adalah %.2f%n", rusuk, luasPermukaan);
    }

    public static void hitungKeliling(Scanner sc){
        System.out.print("Masukkan panjang rusuk kubus: ");
        double rusuk = sc.nextDouble();
        double keliling = 12 * rusuk;
        System.out.printf("Keliling kubus dengan panjang rusuk %.2f adalah %.2f%n", rusuk, keliling);
    }
}
