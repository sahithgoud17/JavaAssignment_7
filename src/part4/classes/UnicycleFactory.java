package part4.classes;

import part4.interfaces.*;
public class UnicycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Unicycle();
    }
}
