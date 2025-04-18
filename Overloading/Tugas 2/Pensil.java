package T2Overloading;

class Pensil extends AlatTulis {
    private String tipe;
    private int harga;

    public Pensil(String jenis, int stok, String tipe) {
        super(jenis, stok);
        this.tipe = tipe;
    }
    
    public Pensil(String jenis, int stok, String tipe, int harga) {
        super(jenis, stok);
        this.tipe = tipe;
        this.harga = harga;
    }

    public String info() {
        return super.info() + " tipe: " + tipe + " harga: " + harga;
    }
}
