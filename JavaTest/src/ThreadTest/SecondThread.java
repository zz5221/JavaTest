package ThreadTest;

public class SecondThread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++) {
            System.out.println("-----"+Thread.currentThread().getName()+""+i);
        }
        
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+""+i);
            if(i==20){
                SecondThread st = new SecondThread();
                new Thread(st,"新线程1").start();
                new Thread(st,"新线程2").start();
            }
        }
    }
}
