public class Shark extends Animal{
    public static void attack(){
        System.out.println("shark is attack");
    }

    @Override
    public void eat() {
        System.out.println("shark is eating");
    }
}
