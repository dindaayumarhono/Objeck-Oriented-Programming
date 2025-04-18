/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class mainbola {
    public static void main(String[] args) {
        bola bola1 = new bola();
        bola1.SetRadius(7);
        bola1.computeAndSetVolume();
        System.out.println("Volume Bola: " + bola1.GetVolume());
    }
}
