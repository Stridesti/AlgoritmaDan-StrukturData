import java.util.Scanner;

public class AntrianKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS q = new AntrianKRS();
        int pilih;
        do {
            System.out.println("\nMenu Antrian KRS");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa (KRS)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Sudah Proses KRS");
            System.out.println("11. Cetak Jumlah Belum Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Antrian penuh!");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Angkatan: ");
                    int angkatan = sc.nextInt(); sc.nextLine();
                    q.enqueue(nim, nama, prodi, angkatan);
                    break;
                case 2: q.dequeueBatch(); break;
                case 3: q.printAll(); break;
                case 4: q.printFront2(); break;
                case 5: q.printRear(); break;
                case 6: System.out.println(q.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong."); break;
                case 7: System.out.println(q.isFull() ? "Antrian penuh." : "Antrian belum penuh."); break;
                case 8: q.clear(); break;
                case 9: q.printJumlahAntrian(); break;
                case 10: q.printJumlahProses(); break;
                case 11: q.printBelumProses(); break;
                case 0: System.out.println("Keluar..."); break;
                default: System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);
        sc.close();
    }
}