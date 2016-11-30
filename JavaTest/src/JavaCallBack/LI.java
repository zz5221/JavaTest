package JavaCallBack;

/**
 * @author hanshizhe
 *这是小李
 */
public class LI {
    /**
     * @param callBack
     * @param question
     */
    public void executeMessage(CallBack callBack,String question){
        System.out.println("小王问的问题是"+question);
        for (int i = 0; i < 1000; i++) {
            
        }
        String result = "答案是2";
        
        callBack.solve(result);
    }
    
}
