package inheritance.hierarchical;

class Bird extends Animal{
    public Bird(){
        super();
        name="Bird";
        System.out.println("i am a "+name);
    }
    public void speak(){
            System.out.println("chirp...chirp");
        }
        public void fly(){
            System.out.println("im flying");
        }
}
