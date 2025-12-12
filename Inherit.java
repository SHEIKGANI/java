class Animal{
    String animalName;
}

class Dog extends Animal{
    void PrintInfo(){
        System.out.println("The Animal name is " + animalName);
    }
}



public class Inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalName = " BARKEE ";
        dog.PrintInfo();
    }
}
