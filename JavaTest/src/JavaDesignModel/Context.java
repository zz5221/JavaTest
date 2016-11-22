package JavaDesignModel;

/**
 * @author hanshizhe
 * 状态模式，切换状态，类似与qq的隐身，在线状态。来进行切换
 */
public class Context {
    private State state=null;

    public Context(State state) {
        super();
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void method(){
        if("state1".equals(state.getState())){
            state.method1();
        }else if("state2".equals(state.getState())){
            state.method2();
        }
    }
    
    public static void main(String[] args) {
        State state = new State();
        state.setState("state1");
        Context context = new Context(state);
        context.method();
    }

}
