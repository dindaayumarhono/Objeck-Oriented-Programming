package inheritance.Latihan;

class Skripsi extends Buku{
    private String NPM;
    
    public Skripsi(String NPM, String penulis, String judul, String penerbit, int tahun) {
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    public String toString() {
        System.out.println("\nSkripsi");
        return super.toString() + "\nNPM: " + NPM;
    }
}