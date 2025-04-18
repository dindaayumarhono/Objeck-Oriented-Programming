/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class mainbalok {
    public static void main(String[] args) {
        balok balok1 = new balok();
        balok1.SetPanjang(7);
        balok1.SetLebar(5);
        balok1.SetTinggi(7);
        balok1.computeAndSetVolume();
        System.out.println("Volume Balok: " + balok1.GetVolume());
    }
}
