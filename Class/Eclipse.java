/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TClass;

/**
 *
 * @author LENOVO
 */
public class Eclipse {
    public int sumbuMayor;
    public int sumbuMinor;  

    public void setSumbuMayor(int sumbuMayor) {
        this.sumbuMayor = sumbuMayor;
    }
    
    public void setSumbuMinor(int sumbuMinor) {
        this.sumbuMinor = sumbuMinor;
    }

    public int getSumbuMayor() {
        return this.sumbuMayor;
    }

    public int getSumbuMinor() {
        return this.sumbuMinor;
    }

    public double getLuas() {
        return Math.PI * this.sumbuMayor * this.sumbuMinor;
    }

    public double getKeliling() {
        return Math.PI * (3 * (this.sumbuMayor + this.sumbuMinor) - 
            Math.sqrt((3 * this.sumbuMayor + this.sumbuMinor) * 
                      (this.sumbuMayor + 3 * this.sumbuMinor)));
    }
}

