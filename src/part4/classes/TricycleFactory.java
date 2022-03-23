package part4.classes;

import part4.interfaces.*;
public class TricycleFactory implements CycleFactory
{
    @Override
    public Cycle getCycle()
    {
        return new Tricycle();
    }
}
