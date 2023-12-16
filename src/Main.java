
public class Main {
    public static void main(String[] args) {
        Eagle e= new Eagle();
        Cat c= new Cat();
        Duck d= new Duck();
        Animal[] animals= {e,c,d};
        for( Animal a: animals)
        {
           a.eat();
        }




    }
}