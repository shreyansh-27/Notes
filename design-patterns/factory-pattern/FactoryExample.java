// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class FactoryExample {
    public static void main(String[] args) {
        AnimalFactory af = new AnimalFactory();
        
        Animal dog = af.getAnimalInstance("dog");
        dog.run();
        
        Animal tiger = af.getAnimalInstance("tiger");
        tiger.run();
        
        
    }
}
interface Animal{
    
    public void run();
    
}

class Tiger implements Animal{
    
    public void run(){
        System.out.println("Meow");
    }
}

class Dog implements Animal{
    
    public void run(){
        System.out.println("bark");
    }
}

class AnimalFactory{
    
    public Animal getAnimalInstance(String animal){
        if(animal.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        if(animal.equalsIgnoreCase("Tiger")){
            return new Tiger();
        }
        
        return null;
    }
    
}







