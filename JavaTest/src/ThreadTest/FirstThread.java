package ThreadTest;

public class FirstThread extends Thread{
    private int i;
    private String name;
    public FirstThread(String name) {
        super();
        this.name = name;
    }
    @Override
    
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name+"-----"+getName()+""+i);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+""+i);
            if(i==20){
                new FirstThread("01").start();
                new FirstThread("02").start();
            }
        }
    }
}
