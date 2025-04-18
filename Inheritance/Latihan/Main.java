package inheritance.Latihan;

public class Main {
    public static void main(String[] args) {
        Buku b = new Buku("Holy Mother", "AKiyoshi Rikako", "Penerbit Haru", 2019);
        Majalah m = new Majalah("Bobo", "Edisi 48", "Blink Publishers", 2025);
        Skripsi s = new Skripsi("23081010175", "Dinda Ayu Puspaningrum", "Analisis AI", "UPNVJT", 2025);

        System.out.println(b);
        System.out.println(m);
        System.out.println(s);
    }
}
