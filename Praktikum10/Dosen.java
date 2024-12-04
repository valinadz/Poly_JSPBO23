package Praktikum10;

public class Dosen extends Pegawai implements Comparable<Dosen> {
    private String nidn;
    private String nama;
    private String kodeDosen;

    // Constructor
    public Dosen(String nidn, String nama, String kodeDosen) {
        this.nidn = nidn;
        this.nama = nama;
        this.kodeDosen = kodeDosen;
    }

    // Getter untuk NIDN
    public String getNidn() {
        return nidn;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Getter untuk Kode Dosen
    public String getKodeDosen() {
        return kodeDosen;
    }

    // Implementasi compareTo() untuk sorting berdasarkan nama
    @Override
    public int compareTo(Dosen otherDosen) {
        return this.nama.compareTo(otherDosen.nama); // Membandingkan berdasarkan nama secara alfabetis
    }

    // Menambahkan toString untuk menampilkan informasi dosen
    @Override
    public String toString() {
        return "Dosen{" +
                "nidn='" + nidn + '\'' +
                ", nama='" + nama + '\'' +
                ", kodeDosen='" + kodeDosen + '\'' +
                '}';
    }
}
