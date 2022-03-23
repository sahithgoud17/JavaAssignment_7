package part1.classes;

public class Main
{
    public static void main(String[] args)
    {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};

        for(Rodent rodent : rodents)
        {
            rodent.eat();
        }
    }
}
