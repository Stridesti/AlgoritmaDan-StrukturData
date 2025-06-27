package Laporan;

public class AntrianKRS {
        private static class Mahasiswa {
            String nim, nama, prodi;
            int angkatan;
    
            Mahasiswa(String nim, String nama, String prodi, int angkatan) {
                this.nim = nim;
                this.nama = nama;
                this.prodi = prodi;
                this.angkatan = angkatan;
            }
    
            public String toString() {
                return nim + " | " + nama + " | " + prodi + " | " + angkatan;
            }
        }
    
        private int max = 10;
        private Mahasiswa[] queue = new Mahasiswa[max];
        private int front = -1, rear = -1, size = 0, totalProses = 0;
    
        public boolean isEmpty() { return size == 0; }
        public boolean isFull() { return size == max; }
        public void clear() { front = rear = -1; size = 0; }
    
        public void enqueue(String nim, String nama, String prodi, int angkatan) {
            if (isFull()) {
                System.out.println("Antrian penuh!");
                return;
            }
            Mahasiswa m = new Mahasiswa(nim, nama, prodi, angkatan);
            if (isEmpty()) front = rear = 0;
            else rear = (rear + 1) % max;
            queue[rear] = m;
            size++;
            System.out.println("Mahasiswa masuk antrian: " + m);
        }
    
        public void dequeueBatch() {
            if (size < 2) {
                System.out.println("Antrian kurang dari 2, tidak bisa proses batch.");
                return;
            }
            System.out.println("Memproses mahasiswa:");
            for (int i = 0; i < 2; i++) {
                System.out.println("- " + queue[front]);
                front = (front + 1) % max;
                size--;
                totalProses++;
                if (size == 0) { front = rear = -1; break; }
            }
        }
    
        public void printAll() {
            if (isEmpty()) { System.out.println("Antrian kosong."); return; }
            System.out.println("Daftar antrian:");
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                System.out.println((i+1) + ". " + queue[idx]);
            }
        }
    
        public void printFront2() {
            if (size < 2) { System.out.println("Antrian kurang dari 2."); return; }
            System.out.println("2 antrian terdepan:");
            for (int i = 0; i < 2; i++) {
                int idx = (front + i) % max;
                System.out.println(queue[idx]);
            }
        }
    
        public void printRear() {
            if (isEmpty()) System.out.println("Antrian kosong.");
            else System.out.println("Antrian paling akhir: " + queue[rear]);
        }
    
        public void printJumlahAntrian() { System.out.println("Jumlah antrian saat ini: " + size); }
        public void printJumlahProses() { System.out.println("Jumlah mahasiswa sudah proses KRS: " + totalProses); }
        public void printBelumProses() { System.out.println("Jumlah mahasiswa belum proses KRS: " + (30 - totalProses)); }
}
