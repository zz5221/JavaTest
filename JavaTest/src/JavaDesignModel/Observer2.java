package JavaDesignModel;

public class Observer2 implements Observer{
    private String name;
    
    public Observer2(String name) {
        super();
        this.name = name;
    }

    @Override
    public void applay() {
        // TODO Auto-generated method stub
        System.out.println(name+"         apply");
    }

}
