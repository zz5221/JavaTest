package JavaCallBack;

public class Test {
    public static void main(String[] args) {
        LI li = new LI();
        Wang wang = new Wang(li);
        wang.askQuestion("1+1=?");
    }
}
