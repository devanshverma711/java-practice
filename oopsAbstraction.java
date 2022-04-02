public class oopsAbstraction {
    public static void main(String[] args){
        Horse h1 = new Horse();
        h1.walk();
    }
}

abstract class Animal{
    public void walk(){   
    }
    Animal(){
        System.out.println("you are creating an Animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("You are creating a Horse");
    }
    public void walk(){
        System.out.println("Horse can walk");
    }
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("Chiken can walk");
    }
}