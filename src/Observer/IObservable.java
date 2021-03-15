package Observer;

import java.util.Observable;

public interface IObservable  {

    public void setObserver(IObserver observer);
    public void deleteObserver();
    public boolean notifyObserver();
    public void myNotify();
}
