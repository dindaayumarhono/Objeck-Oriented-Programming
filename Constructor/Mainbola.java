/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Mainbola {
    public static void main(String[] args) {
        bola bola1 = new bola(7);
        bola1.computeAndSetVolume();
        System.out.println("jari-jari: " + bola1.radius);
        System.out.println("Volume: " + bola1.getVolume());
    }
}
