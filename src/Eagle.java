public class Eagle extends Animal{
    public static void fly(){
        System.out.println("eagle flies");
    }

    @Override
    public void eat() {
        System.out.println("eagle is eating");
    }
}
