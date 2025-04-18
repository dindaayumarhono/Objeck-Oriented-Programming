package T2Overloading;

public class Main {
    public static void main(String[] args) {
        AlatTulis[] alatTulis = {
            new AlatTulis("bolpoin", 100),
            new AlatTulis("pensil", 120),
            new AlatTulis("penghapus", 78)
        };
        
        Pensil[] koleksiPensil = {
            new Pensil("pensil karbon", 100, "2B", 4000),
            new Pensil("pensil karbon", 110, "HB", 3500),
            new Pensil("pensil warna", 98, "-", 3500)
        };
        
        PensilWarna[] koleksiPensilWarna = {
            new PensilWarna("pensil warna", 23, "-", 5000, "Faber-Castell", "coklat"),
            new PensilWarna("pensil warna", 67, "-", 6000, "Staedtler", "ungu"),
            new PensilWarna("pensil warna", 56, "-", 5500, "Deli", "kuning")
        };
        
        System.out.println("Daftar Alat Tulis:");
        for (AlatTulis alat : alatTulis) {
            System.out.println(alat.info());
        }
        
        System.out.println("\nDaftar Pensil:");
        for (Pensil pensil : koleksiPensil) {
            System.out.println(pensil.info());
        }
        
        System.out.println("\nDaftar Pensil Warna:");
        for (PensilWarna pensilWarna : koleksiPensilWarna) {
            System.out.println(pensilWarna.info());
        }
    }
}
