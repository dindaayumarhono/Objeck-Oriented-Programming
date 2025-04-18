package inheritance.single;

public class Animal {
    public Animal(){
        System.out.println("i am animal");
    }
    public void speak(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        Animal a = new Animal();
        a.speak();
        Bird b = new Bird();
        b.speak();
        b.fly();
    }
}
