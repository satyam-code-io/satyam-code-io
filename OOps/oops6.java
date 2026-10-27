// // Concept of polymorphism :-
// advance version of overriding that means ye same chiz ko baar baar different tarike se access krne ki bajaye ek best method deta hai 

//Example:-

class Animal{
    void sound(){
        System.out.println("animals sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("dogs barks");
    }
}
class Cat extends Animal{
    @Override 
    void sound(){
        System.out.println("cat meows");
    }
}
public class oops6{
    public static void main(String[] args) {
        Animal[]animals={ new Dog(), new Cat()};
        for(Animal animal:animals){
            animal.sound();
        
        }
    }
}
