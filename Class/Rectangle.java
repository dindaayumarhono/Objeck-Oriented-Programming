/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TClass;

/**
 *
 * @author LENOVO
 */
public class Rectangle {
    public int lebar;
    public int panjang;
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getLebar(){
        return this.lebar;
    }
    
    public int getPanjang(){
        return this.panjang;
    }
    
    public int getLuas(){
        return this.lebar * this.panjang; 
    }
    
    public int getKeliling(){
        return 2 * (this.lebar * this.panjang);
    }
}
