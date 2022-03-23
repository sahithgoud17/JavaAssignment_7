package part4.classes;

import part4.interfaces.*;
public class Tricycle implements Cycle
{
    @Override
    public void ride()
    {
        System.out.println("Riding Tricycle");
    }
    @Override
    public void numberOfWheels()
    {
        System.out.println("Tricycle has 3 wheels.");
    }
}
