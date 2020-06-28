package cn.anygloble.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("数学");
        StudentClone stu1 = new StudentClone("11",12,book);
        StudentClone stu2 = stu1.clone();
        book.setBookname("语文");
        stu2.setAge(14);
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
