package cn.anygloble.serialized;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -7735102678940454884L;
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();

        if (0>score || 100<score){
            throw new IllegalArgumentException("分数不合理！");
        }
    }

}
