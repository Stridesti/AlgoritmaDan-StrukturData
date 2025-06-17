import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = sc.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        
        if ((tugas < 0 || tugas >100) || (kuis < 0 || kuis >100) || (uts < 0 || uts >100) || (uas < 0 || uas >100)){
            System.out.println("Nilai Tidak Valid");   
            System.out.println("======================");
            System.out.println("======================");
           
        } else {
            double nilaiAkhir = ((tugas * 0.2) + ( kuis * 0.1) + (uts * 0.3) + (uas * 0.3));
            System.out.println("Nilai Akhir : " + nilaiAkhir);

            String nilaiHuruf;
            boolean lulus;

            if (nilaiAkhir <= 100 && nilaiAkhir > 80){
                nilaiHuruf = "A";
                lulus = true;
            } else if (nilaiAkhir <= 80 && nilaiAkhir > 73){
                nilaiHuruf = "B+";
                lulus = true;
            } else if (nilaiAkhir <= 73 && nilaiAkhir > 65){
                nilaiHuruf = "B";
                lulus = true;
            } else if (nilaiAkhir <= 65 && nilaiAkhir > 60){
                nilaiHuruf = "C+";
                lulus = true;
            } else if (nilaiAkhir <= 60 && nilaiAkhir > 50){
                nilaiHuruf = "C";
                lulus = true;
            } else if (nilaiAkhir <= 50 && nilaiAkhir > 39){
                nilaiHuruf = "D";
                lulus = false;
            } else {
                nilaiHuruf = "E";
                lulus = false;
            }
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            
            if (lulus = true){
                System.out.println("SELAMAT ANDA LULUS!");
            } else {
                System.out.println("TIDAK LULUS!");
            }
        }
    } 
}
