package cn.anygloble.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Message> list = new ArrayList<Message>();

    public Subject() {
    }
    public void addMessage(Message message){
        list.add(message);
    }
    public void notifyMessage(String s){
        list.forEach(o -> o.sendMassage(s));
    }
}
