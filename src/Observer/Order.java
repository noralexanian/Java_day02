package Observer;

public class Order implements IObservable {
    String position;
    String destination;
    int timeBeforeArrival;
    IObserver observer;

    public String getPosition() { return position; }
    public String getDestination() { return destination; }
    public int getTimeBeforeArrival() { return timeBeforeArrival; }

    public void setData(String pos, int time, String dest) {
        position = pos;
        destination = dest;
        timeBeforeArrival = time;
        this.myNotify();
    }

    @Override
    public void setObserver(IObserver observer) {

        this.observer = observer;
    }

    @Override
    public void deleteObserver() {
        this.observer = null;
    }

    @Override
    public boolean notifyObserver() {
        return (this.observer != null);
    }

    @Override
    public void myNotify() {
        this.observer.update(this);
    }

}
