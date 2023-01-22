import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shark shark=new Shark();
        Shark shark1=new Shark();
        Shark shark2=new Shark();
        Shark shark3=new Shark();
        Shark shark4=new Shark();
        Eagle eagle=new Eagle();
        Eagle eagle1=new Eagle();
        Eagle eagle2=new Eagle();
        Eagle eagle3=new Eagle();
        Eagle eagle4=new Eagle();
        Turtle turtle=new Turtle();
        Turtle turtle1=new Turtle();
        Turtle turtle2=new Turtle();
        Turtle turtle3=new Turtle();
        Turtle turtle4=new Turtle();
        Animal[]animals={shark,shark1,shark2,shark3,shark4,eagle,eagle1,eagle2,eagle3,eagle4,turtle,turtle1,turtle2,turtle3,turtle4};
        for(Animal animal:animals){
            if(animal instanceof Shark){
                Shark.sharks = new Shark[]{(Shark) animal};
                shark.eat();
                Shark.attack();
            }else if(animal.getClass().getName().equals("Turtle")){
                Turtle.turtles = new Turtle[]{(Turtle) animal};
                turtle.eat();
                Turtle.swim();
            }else{
                Eagle.eagles = new Eagle[]{(Eagle) animal};
                eagle.eat();
                Eagle.fly();
            }
        }


    }
}