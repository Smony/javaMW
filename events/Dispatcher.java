package events;

public class Dispatcher {

    private Event event;

    public Dispatcher(Event event)
    {
        this.event = event;
    }

    public void dispath(Event.Type type, EventHandler handler)
    {
         if (event.handled)
             return;
         if (event.getType() == type)
             handler.handle(event);
    }
}