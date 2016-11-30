package JavaDesignModel;

/**
 * @author hanshizhe
 * 中介者模式
 */
public class User2 extends AbstracteUser{

    public User2(Mediator mMediator) {
        super(mMediator);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        System.out.println("user2 work");
    }

}