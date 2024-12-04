package Praktikum10;

public class Document implements Printable {
    public String fileName;
    public String content;

    @Override
    public void print() {
        System.out.println("Mencetak dokumen:");
        System.out.println("Nama file: " + fileName);
        System.out.println("Isi dokumen: " + content);
    }
}
