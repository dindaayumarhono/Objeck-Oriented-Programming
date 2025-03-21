package TClass;

public class Square {
    public int sisi;
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getSisi(){
        return this.sisi;
    }
    
    public int getLuas(){
        return this.sisi * this.sisi; 
    }
    
    public int getKeliling(){
        return 4 * this.sisi;
    }
}
