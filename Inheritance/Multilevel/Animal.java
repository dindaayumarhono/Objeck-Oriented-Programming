package inheritance.multilevel;

public class Animal {
    public Animal(){
        System.out.println("i am animal");
    }
    public void speak(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Bird b = new Bird();
        b.speak();
        b.fly();
        Penguin p = new Penguin();
        p.speak();
        p.fly();
    }
}
