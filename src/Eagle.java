public class Eagle extends Animal implements Flyable{
    void eat()
    {
        System.out.println("EAGLE EATING");
    }
    @Override
    public void fly()
    {
        System.out.println(" Eagle flying");
    }
}
