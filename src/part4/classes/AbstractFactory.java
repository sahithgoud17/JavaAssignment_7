package part4.classes;
import part4.interfaces.*;
public class AbstractFactory
{
    public void createCycle(CycleFactory factory)
    {
        Cycle c = factory.getCycle();
        c.ride();
        c.numberOfWheels();
    }
}
