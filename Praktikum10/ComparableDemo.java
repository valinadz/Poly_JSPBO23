package Praktikum10;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        // Membuat ArrayList of Dosen
        ArrayList<Dosen> daftarDosen = new ArrayList<>();
        
        // Menambahkan objek Dosen ke dalam daftar
        daftarDosen.add(new Dosen("321", "Bella", "0091"));
        daftarDosen.add(new Dosen("123", "Adila", "0081"));
        daftarDosen.add(new Dosen("231", "Petrus", "0071"));

        // Melakukan sorting menggunakan Collections.sort()
        Collections.sort(daftarDosen);
    }
}
