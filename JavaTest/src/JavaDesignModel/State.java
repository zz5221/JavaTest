package JavaDesignModel;

/**
 * @author hanshizhe
 * 状态模式,切换状态
 */
public class State {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void method1() {
        System.out.println("execute first method");
    }

    public void method2() {
        System.out.println("execute second method");
    }
    
}
