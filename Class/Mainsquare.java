/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TClass;

/**
 *
 * @author LENOVO
 */
public class Mainsquare {
    public static void main(String[] args){
     Square kotak1 = new Square();   
     kotak1.setSisi(5);
     System.out.println("Sisi Persegi = "+kotak1.getSisi());
     System.out.println("Luas Persegi = "+kotak1.getLuas());
     System.out.println("Keliling Persegi = "+kotak1.getKeliling());

    }
}
