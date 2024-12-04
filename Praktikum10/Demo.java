package Praktikum10;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        Pegawai tendik1 = new Pegawai("19750301", "Aida, A.Md.");
        
        // Memanggil method train() untuk objek Dosen dan TenagaKependidikan
        train(dosen1);
        train(tendik1);
    }
    
    public static void train(Pegawai pegawai) {
        // Menampilkan informasi umum pegawai
        pegawai.displayInfo();
        
        // Memberikan informasi umum
        System.out.println("Mengenalkan lingkungan kampus");
        System.out.println("Menginfokan SOP/Juknis");

        // Jika pegawai adalah objek Dosen, berikan pelatihan spesifik
        if (pegawai instanceof Dosen) {
            System.out.println("Memberikan pelatihan pedagogik");
        }
    }
}
