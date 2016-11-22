package JavaDesignModel;

public class Observer1 implements Observer{
    private String name;
    public Observer1(String name) {
        super();
        this.name = name;
    }
    @Override
    public void applay() {
        // TODO Auto-generated method stub
        System.out.println( name +"  Observer1 收到");
    }
    
}
