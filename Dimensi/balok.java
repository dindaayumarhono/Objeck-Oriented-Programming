/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    public int volume;
    
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume = panjang * lebar * tinggi;
    }
    
    public int GetVolume(){
        return this.volume;
    }
}
