package inheritance.hierarchical;

class Cat extends Animal{
    public Cat(){
        super();
        name="cat";
        System.out.println("i am a "+name);
    }
    public void speak(){
        System.out.println("meow");
    }
}
