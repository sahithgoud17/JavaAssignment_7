package part5;

public class Main
{
    public static void main(String[] args)
    {
        SecondClass secondClass = new SecondClass();
        FirstClass.FirstInner firstInner = secondClass.new FirstInner("Inside first inner class!");
    }
}