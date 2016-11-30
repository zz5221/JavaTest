package JavaCallBack;

/**
 * @author hanshizhe
 *这个个小王 问 问题
 */
public class Wang implements CallBack{
    private LI li;
    
    /**
     * @param li
     * 小王的构造方法，持有小李的引用
     */
    public Wang(LI li) {
        super();
        this.li = li;
    }
    public void askQuestion(final String question){
        System.out.println("向小明打电话，请教问题");
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
              li.executeMessage(Wang.this, question);
            }
        }).start();
        play();
    }
    public void play(){
        System.out.println("我去逛街啦");
    }
    @Override
    public void solve(String result) {
        // TODO Auto-generated method stub
        System.out.println("结果是"+result);
    }
    
    
    
}
