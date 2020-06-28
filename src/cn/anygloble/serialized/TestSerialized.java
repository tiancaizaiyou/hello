package cn.anygloble.serialized;

import java.io.*;

public class TestSerialized {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stu = new Student();
        stu.setName("吴松");
        stu.setScore(100);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        oos.writeObject(stu);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Student o = (Student)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
