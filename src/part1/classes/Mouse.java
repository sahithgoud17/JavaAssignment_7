package part1.classes;

public class Mouse extends Rodent
{

    public Mouse()
    {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void eat()
    {
        System.out.println("Mouse is eating.");
    }
}