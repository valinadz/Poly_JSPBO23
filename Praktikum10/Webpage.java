package Praktikum10;

public class Webpage implements Printable {
    public String url;
    public String title;
    public String content;

    @Override
    public void print() {
        System.out.println("Mencetak halaman web:");
        System.out.println("URL: " + url);
        System.out.println("Judul: " + title);

        // Menghapus tag HTML dari konten
        String plainText = content.replaceAll("<[^>]*>", "");
        System.out.println("Konten: " + plainText);
    }
}