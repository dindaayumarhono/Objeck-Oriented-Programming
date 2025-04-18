/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class maintabung {
    public static void main(String[] args) {
        tabung tabung1 = new tabung();
        tabung1.SetRadius(7);
        tabung1.SetTinggi(6);
        tabung1.computeAndSetVolume();
        System.out.println("Volume Tabung: " + tabung1.GetVolume());
    }
}
