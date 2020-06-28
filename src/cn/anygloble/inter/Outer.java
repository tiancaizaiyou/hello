package cn.anygloble.inter;


public class Outer {
    private int num=10;

    public class Inter{//成员内部类
        private int num=20;

        public void method(){
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Outer.this.num);//10
        }
    }

    public void method(){
        int num = 40;
        class Inter2{//局部内部类 只能当前的方法调用
            int num = 50;
            public void method(){
                System.out.println(num);
            }
        }
        Inter2 inter2 = new Inter2();
        inter2.method();
    }

    public void method2(){
        class Inter2{
            int num = 60;
            public void method(){
                System.out.println(num);
            }
        }
        Inter2 inter2 = new Inter2();
        inter2.method();
    }

}
