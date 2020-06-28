package cn.anygloble.ThreadTest;

public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+ "张票");
                    ticket--;
                }
            }
        }
    }
}
