package JavaDesignModel;

/**
 * @author hanshizhe
 * 中介者模式-定义User
 */
public abstract class AbstracteUser {
    private Mediator mMediator;

    public AbstracteUser(Mediator mMediator) {
        super();
        this.mMediator = mMediator;
    }

    public Mediator getmMediator() {
        return mMediator;
    }
    public abstract void work();
    
}
