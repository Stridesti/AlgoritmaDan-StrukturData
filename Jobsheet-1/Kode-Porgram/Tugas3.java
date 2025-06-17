import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tugas3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMataKuliah = new ArrayList<>();
        ArrayList<Integer> sks = new ArrayList<>();
        ArrayList<Integer> semester = new ArrayList<>();
        ArrayList<String> hariKuliah = new ArrayList<>();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Mata Kuliah " + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah.add(scanner.nextLine());
            System.out.print("SKS: ");
            sks.add(scanner.nextInt());
            System.out.print("Semester: ");
            semester.add(scanner.nextInt());
            System.out.print("Hari Kuliah: ");
            scanner.nextLine(); // Membersihkan newline
            hariKuliah.add(scanner.nextLine());
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Mencari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nJadwal Kuliah:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Mata Kuliah: " + namaMataKuliah.get(i) +
                                ", SKS: " + sks.get(i) +
                                ", Semester: " + semester.get(i) +
                                ", Hari: " + hariKuliah.get(i));
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah (misalnya, Senin, Selasa, dst.): ");
                    String hari = scanner.nextLine();
                    System.out.println("\nJadwal Kuliah pada hari " + hari + ":");
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah.get(i).equalsIgnoreCase(hari)) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah.get(i) +
                                    ", SKS: " + sks.get(i) +
                                    ", Semester: " + semester.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = scanner.nextInt();
                    System.out.println("\nJadwal Kuliah pada semester " + sem + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester.get(i) == sem) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah.get(i) +
                                    ", SKS: " + sks.get(i) +
                                    ", Hari: " + hariKuliah.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String cariMataKuliah = scanner.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMataKuliah.get(i).equalsIgnoreCase(cariMataKuliah)) {
                            System.out.println("Mata Kuliah: " + namaMataKuliah.get(i) +
                                    ", SKS: " + sks.get(i) +
                                    ", Semester: " + semester.get(i) +
                                    ", Hari: " + hariKuliah.get(i));
                            ditemukan = true;
                            break; 
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
            
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                
            }
        }
    }
}
