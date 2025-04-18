/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class array {
    public static void main(String[] args) {
        Object[] arr = {
            new kubus(4),
            new balok(5, 3, 2),
            new tabung(7, 10),
            new Limassegiempat(6, 10),
            new bola(7)
        };

        System.out.println("Volume masing-masing bangun ruang:");
        for (Object bangun : arr) {
            if (bangun instanceof kubus) {
                System.out.println("Kubus: " + ((kubus) bangun).getVolume());
            } else if (bangun instanceof balok) {
                System.out.println("Balok: " + ((balok) bangun).getVolume());
            } else if (bangun instanceof tabung) {
                System.out.println("Tabung: " + ((tabung) bangun).getVolume());
            } else if (bangun instanceof Limassegiempat) {
                System.out.println("Limas Segi Empat: " + ((Limassegiempat) bangun).getVolume());
            } else if (bangun instanceof bola) {
                System.out.println("Bola: " + ((bola) bangun).getVolume());
            }
        }

        double totalVolume = 0;
        for (Object bangun : arr) {
            if (bangun instanceof kubus) {
                totalVolume += ((kubus) bangun).getVolume();
            } else if (bangun instanceof balok) {
                totalVolume += ((balok) bangun).getVolume();
            } else if (bangun instanceof tabung) {
                totalVolume += ((tabung) bangun).getVolume();
            } else if (bangun instanceof Limassegiempat) {
                totalVolume += ((Limassegiempat) bangun).getVolume();
            } else if (bangun instanceof bola) {
                totalVolume += ((bola) bangun).getVolume();
            }
        }

        double rataRataVolume = totalVolume / arr.length;
        System.out.println("\nRata-rata volume dari semua bangun ruang: " + rataRataVolume);
    }
}
