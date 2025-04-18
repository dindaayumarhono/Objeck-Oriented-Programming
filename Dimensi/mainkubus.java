/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class mainkubus {
    public static void main(String[] args) {
        kubus kubus1 = new kubus();
        kubus1.SetSisi(5);
        kubus1.computeAndSetVolume();
        System.out.println("Volume Kubus: " + kubus1.GetVolume());
    }
}
