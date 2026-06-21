class SingletonPatternExample
{
    private static SingletonPatternExample patterninstance;
    private SingletonPatternExample()
    {
        System.out.println("Instance Created");
    }
    public static SingletonPatternExample getInstance()
    {
        if(patterninstance == null)
            patterninstance=new SingletonPatternExample();

        return patterninstance;

    }
    public void log(String message)
    {
         System.out.println("[LOG]: " + message);
    }
     
}

public class Test {
    public static void main(String[] args) {
        SingletonPatternExample obj1 = SingletonPatternExample.getInstance();
        SingletonPatternExample obj2 = SingletonPatternExample.getInstance();
        obj1.log("Application Started");
        obj2.log("User Logged In");
        System.out.println(obj1 == obj2);
    }
}