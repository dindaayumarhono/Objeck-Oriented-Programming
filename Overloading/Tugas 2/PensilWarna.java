package T2Overloading;

class PensilWarna extends Pensil {
    private String merek;
    private String warna;

    public PensilWarna(String jenis, int stok, String tipe, int harga, String merek) {
        super(jenis, stok, tipe, harga);
        this.merek = merek;
    }
    
    public PensilWarna(String jenis, int stok, String tipe, int harga, String merek, String warna) {
        super(jenis, stok, tipe, harga);
        this.merek = merek;
        this.warna = warna;
    }

    public String info() {
        return super.info() + " merek: " + merek + " warna: " + warna;
    }
}
