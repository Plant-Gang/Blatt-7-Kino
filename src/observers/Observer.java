package observers;

/**
 * An Observer that asks Observables to be notified when an event occurs
 */
public interface Observer
{
    /**
     * Tells the Observable to add this Observer to the list of subscribers
     * 
     * @param observable the observable this Observer wants to subscribe to
     */
    public void listen(Observable observable);
}
