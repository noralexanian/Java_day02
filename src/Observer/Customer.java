package Observer;

public class Customer implements IObserver {
    @Override
    public void update(IObservable observable) {
        if (observable instanceof Order) {
            Order temp = (Order)observable;

            System.out.println("("+temp.position + "), " +
                    temp.timeBeforeArrival + " minutes before arrival at " +
                    temp.destination);
        }
    }
}
