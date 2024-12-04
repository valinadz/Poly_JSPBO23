package Praktikum10;

public class TenagaKependidikan extends Pegawai {
    public String kategori;

    // Constructor
    public TenagaKependidikan() {}

    public TenagaKependidikan(String nip, String nama, String kategori) {
        super(nip, nama);  // Memanggil constructor dari superclass (Pegawai)
        this.kategori = kategori;
    }

    // Override method displayInfo() untuk menambahkan informasi kategori
    @Override
    public void displayInfo() {
        super.displayInfo();  // Memanggil displayInfo() dari superclass
        System.out.println("Kategori: " + kategori);
    }
}
