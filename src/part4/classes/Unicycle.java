package part4.classes;

import part4.interfaces.*;
public class Unicycle implements Cycle
{
    @Override
    public void ride()
    {
        System.out.println("Riding Unicycle");
    }

    @Override
    public void numberOfWheels()
    {
        System.out.println("Unicycle has 1 wheel.");
    }
}
