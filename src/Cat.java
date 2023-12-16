public class Cat extends Animal implements Swimmable{
    void eat()
    {
        System.out.println("CAT EATING");
    }
    @Override
    public void swim()
    {
        System.out.println(" Cat is swimming");
    }
}
