package T2Overloading;

class AlatTulis {
    protected String jenis;
    protected int stok;

    public AlatTulis(String jenis) {
        this.jenis = jenis;
    }
    
    public AlatTulis(String jenis, int stok) {
        this.jenis = jenis;
        this.stok = stok;
    }

    public String info() {
        return "jenis: " + jenis + " stok:" + stok;
    }
}
