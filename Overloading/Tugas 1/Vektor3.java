package Overloading;

class Vektor3 {
    private int[] elemen;
    
    public Vektor3(int x, int y, int z) {
        this.elemen = new int[]{x, y, z};
    }
    
    public Vektor3 PerkalianSkalar(int skalar) {
        return new Vektor3(
            elemen[0] * skalar,
            elemen[1] * skalar,
            elemen[2] * skalar
        );
    }
    
    public int PerkalianVektor(Vektor3 vektor) {
        return elemen[0] * vektor.elemen[0] +
               elemen[1] * vektor.elemen[1] +
               elemen[2] * vektor.elemen[2];
    }
}
