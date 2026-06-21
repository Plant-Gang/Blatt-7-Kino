package observers;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable
{

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    protected void update(Observable this)
    {
        for (Observer o : observers)
        {
            o.listen(this);
        }
    }
}
