package cn.anygloble.clone;

public class StudentClone implements Cloneable {
    private String name;
    private int age;
    private Book book;

    public StudentClone(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public StudentClone() {
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
    protected StudentClone clone() throws CloneNotSupportedException {
        StudentClone stu = null;
        stu= (StudentClone) super.clone();
        //stu.book = book.clone();
        return stu;
    }

    @Override
    public String toString() {
        return "StudentClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }
}
