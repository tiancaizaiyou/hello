package cn.anygloble;

public class Benchi extends Car {
    String name;
    public Benchi(String name){

        super(name);
        super.name=name;
        System.out.println("子类构造");
    }
}
