package part4.classes;

import part4.interfaces.*;
public class BicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Bicycle();
    }
}
