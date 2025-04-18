/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Mainkubus {
    public static void main(String[] args) {
        kubus kubus1 = new kubus(4);
        kubus1.computeAndSetVolume();
        System.out.println("sisi: " + kubus1.sisi);
        System.out.println("Volume: " + kubus1.getVolume()); 

        
    }
}
