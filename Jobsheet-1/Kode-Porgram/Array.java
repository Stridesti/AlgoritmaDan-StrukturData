import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Pemrograman",
            "Critical Thinking Dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar  PEmrograman",
            "Praktium Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk Mk " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            bobotNilai[i] = konversiNilaikeBobot(nilaiAngka[i]);
        }
        System.out.println("=============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=============================");

        System.out.print("Mk, Nilai angka, Nilai Huruf, Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-50s %-15.2f %-15s %-15.2f%n",
                mataKuliah[i], 
                nilaiAngka[i], 
                konversiNilaiKeHuruf(nilaiAngka[i]), 
                bobotNilai[i]);
        }

        double ip = hitungIP(bobotNilai);
        System.out.println("=============================");
        System.out.printf("IP: %.2f%n", ip);
    }

    public static String konversiNilaiKeHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "B-";
        else if (nilai >= 60) return "C+";
        else if (nilai >= 55) return "C";
        else if (nilai >= 50) return "C-";
        else if (nilai >= 40) return "D";
        else return "E";
    }

    public static double konversiNilaikeBobot(double nilai) {
        if (nilai >= 85) return 4.0;
        else if (nilai >= 80) return 3.7;
        else if (nilai >= 75) return 3.3;
        else if (nilai >= 70) return 3.0;
        else if (nilai >= 65) return 2.7;
        else if (nilai >= 60) return 2.3;
        else if (nilai >= 55) return 2.0;
        else if (nilai >= 50) return 1.7;
        else if (nilai >= 40) return 1.0;
        else return 0.0;
    }
    public static double hitungIP(double[] bobotNilai) {
        double totalBobot = 0.0;
        for (double bobot : bobotNilai) {
            totalBobot += bobot;
        }
        return totalBobot / bobotNilai.length;
    }
}
