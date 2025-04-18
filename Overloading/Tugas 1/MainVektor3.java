package Overloading;

public class MainVektor3 {
    public static void main(String[] args) {
        Vektor3 v1 = new Vektor3(4, 6, 2);
        Vektor3 v2 = new Vektor3(9, 1, 7);

        int skalar = 3;
        Vektor3 PerkalianSkalar = v1.PerkalianSkalar(skalar);
        System.out.println(v1 + " * " + skalar + " = " + PerkalianSkalar);

        int PerkalianVektor = v1.PerkalianVektor(v2);
        System.out.println(v1 + " * " + v2 + " = " + PerkalianVektor);
    }
}
