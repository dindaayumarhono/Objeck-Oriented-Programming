package inheritance.single;

    class Bird extends Animal {
        public Bird(){
            super();
            System.out.println("I am a bird");
        }
        public void speak(){
            System.out.println("chirp...chirp");
        }
        public void fly(){
            System.out.println("im flying");
        }
    }

