package observers;

import java.util.ArrayList;
import java.util.List;

/**
 * An Observable object that tells its Observers when an event occurs
 */
public abstract class Observable
{

    private List<Observer> observers = new ArrayList<>();

    /**
     * Adds the given Observer to the list of Observers
     * 
     * @param observer
     */
    public void addObserver(Observer observer)
    {

        observers.add(observer);
    }

    /**
     * Notifies all subscribed Observers when an event occurs
     * 
     * @param Observable this observable object
     */
    protected void update(Observable this)
    {
        for (Observer o : observers)
        {
            o.listen(this);
        }
    }
}
