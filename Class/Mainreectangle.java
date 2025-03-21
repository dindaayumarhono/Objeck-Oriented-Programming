package TClass;

public class Mainreectangle {
    public static void main(String[] args){
     Rectangle persegipanjang = new Rectangle();   
     persegipanjang.setLebar(5);
     persegipanjang.setPanjang(10);
     System.out.println("Sisi Persegi Panjang = "+persegipanjang.getLebar());
     System.out.println("Panjang Persegi Panjang = "+persegipanjang.getPanjang());
     System.out.println("Keliling Persegi Panjang = "+persegipanjang.getKeliling());
     System.out.println("Luas Persegi Panjang = "+persegipanjang.getLuas());
    }
}
