package part1.classes;

public class Gerbil extends Rodent {

    public Gerbil()
    {
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void eat()
    {
        System.out.println("Gerbil is eating.");
    }
}
