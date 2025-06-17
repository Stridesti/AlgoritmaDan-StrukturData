public class Fungsi {
    
    public static void main(String[] args) {
        String[] bunga = {"Ag;onema", "Keladi", "Alocasia", "Mawar"};
        int[] harga = {75000, 50000, 60000, 100000};
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        tampilkanpendapatan(bunga, harga, cabang, stok);
        tampilkanStockcabang4(bunga, stok);
    }

    static void tampilkanpendapatan(String[] bunga, int[] harga, String[] cabang, int[][] stok) {
        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                pendapatan = pendapatan + (stok[i][j]*harga[j]);
            }
            System.out.println("Total pendaptan "+cabang[i]+" = "+pendapatan);
        }
    }

    static void tampilkanStockcabang4(String[] bunga, int[][] stok){
        System.out.println("stok bunga di cabang RoyalGarden 4");
        int x = 0;
        int pengurangan[] = {1, 2, 0, 5};
        for(int j = 0; j < bunga.length; j++){
            x = stok[3][j] - pengurangan[j];
            System.out.println("stok bunga "+bunga[j]+" = "+x);
        }
    }
}
