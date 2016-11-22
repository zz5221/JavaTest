package JavaDesignModel;

public interface Subject {
    public void addObserver(Observer ob);
    public void delObserver(Observer ob);
    public void notifyObserver();
    public void operation(Observer ob);
}
