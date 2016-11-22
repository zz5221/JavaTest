package JavaDesignModel;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMySubject implements Subject{
    private List<Observer> subObserver = new ArrayList<Observer>();
    
    @Override
    public void addObserver(Observer ob) {
        // TODO Auto-generated method stub
        if(null != ob){
            subObserver.add(ob);
        }
    }
    
    @Override
    public void delObserver(Observer ob) {
        // TODO Auto-generated method stub
        if(null != ob){
            subObserver.remove(ob);
        }
    }
    
    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for(Observer ob:subObserver){
            ob.applay();
        }
    }
}
