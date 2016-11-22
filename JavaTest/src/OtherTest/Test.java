package OtherTest;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.stringText();
    }

    private void shortText() {
        short s1 = 1;
        s1 = (short) (s1 + 1);
        s1 += 1;// s1 = (short) (s1+1);其中有隐含的强制类型转换。
    }
    
    private void stringText(){
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }
}
