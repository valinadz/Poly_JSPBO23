package Praktikum10;

public class Pegawai {
    public String nip;
    public String nama;

    // Constructor
    public Pegawai() {}

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Method untuk menampilkan informasi pegawai
    public void displayInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
    }
}
