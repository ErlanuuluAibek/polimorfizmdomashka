public class Turtle extends Animal{
    public static void swim(){
        System.out.println("turtle swimming");
    }

    @Override
    public void eat() {
        System.out.println("turtle is eating");
    }
}
