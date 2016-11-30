package JavaDesignModel;

public class Invoker {
    Command mCommand;

    public Invoker(Command mCommand) {
        super();
        this.mCommand = mCommand;
    }
    
    public void action(){
        mCommand.exe();
    }
    
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        MyCommand myCommand = new MyCommand(receiver);
        Invoker invoker = new Invoker(myCommand);
        invoker.action();
    }
}
