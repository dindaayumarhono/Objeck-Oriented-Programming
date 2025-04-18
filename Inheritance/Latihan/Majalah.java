package inheritance.Latihan;

class Majalah extends Koleksi{
    private String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun) {
        super(judul, penerbit, tahun);
        this.edisi = edisi;       
    }
    
    public String toString() {
        System.out.println("\nMajalah");
        return super.toString() + "\nEdisi: " + edisi;
    }
}
