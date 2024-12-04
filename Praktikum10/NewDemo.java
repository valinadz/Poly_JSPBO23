package Praktikum10;

import java.util.ArrayList;

public class NewDemo {
    public static void main(String[] args) {
        // Instansiasi objek Webpage
        Webpage webpage1 = new Webpage();
        webpage1.title = "Jurusan Teknologi Informasi Polinema";
        webpage1.url = "https://jti.polinema.ac.id/";
        webpage1.content = "<h1>Ini contoh heading</h1><br/>";

        // Instansiasi objek Document
        Document doc1 = new Document();
        doc1.fileName = "PBO 2024.docx";
        doc1.content = "Contoh content Pemrograman Berorientasi Objek";

        // Instansiasi Printer
        Printer printer1 = new Printer();

        // Mencetak menggunakan objek Printer
        System.out.println("=== Pencetakan Individu ===");
        printer1.cetak(webpage1); // Webpage sebagai argumen
        System.out.println();
        printer1.cetak(doc1);     // Document sebagai argumen
        System.out.println();

        // Demonstrasi penggunaan ArrayList of Printable
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(webpage1); // Polymorphism memungkinkan ini
        printables.add(doc1);

        System.out.println("=== Pencetakan dari ArrayList ===");
        for (Printable printable : printables) {
            printer1.cetak(printable); // Memanggil method cetak pada setiap elemen
            System.out.println();
        }
    }
}
