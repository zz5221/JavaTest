package JavaDesignModel;

/**
 * @author hanshizhe
 * 命令模式
 */
public class MyCommand implements Command{
    private Receiver receiver;
    public MyCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }
    @Override
    public void exe() {
        // TODO Auto-generated method stub
        receiver.action();
    }
    
}
