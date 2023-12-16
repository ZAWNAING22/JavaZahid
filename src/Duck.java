public class Duck extends Animal implements Moveable,Flyable,Swimmable{


    void eat()
    {
        System.out.println("DUCK EATING");
    }
    @Override
    public void move()
    {
        System.out.println(" Duck is moving");
    }
    @Override
    public void fly()
    {
        System.out.println(" duck is flying");
    }
    @Override
    public void swim()
    {
        System.out.println(" duck is swimming");
    }


}
