package cn.anygloble.test01;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        //return 0;
        if(o.age>this.age){
            return -1;
        } else if(o.age==this.age){
            return 0;
        } else if(o.age<this.age) {
            return 1;
        }
        return 0;
    }
}
