/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class mainlimas {
    public static void main(String[] args) {
        limassegiempat limas1 = new limassegiempat();
        limas1.SetSisi(5);
        limas1.SetTinggi(8);
        limas1.computeAndSetVolume();
        System.out.println("Volume Limas: " + limas1.GetVolume());
    }
}
