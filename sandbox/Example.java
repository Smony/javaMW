package sandbox;

import events.Dispatcher;
import events.Event;
import events.types.MouseMotionEvent;
import events.types.MousePressedEvent;
import events.types.MouseReleasedEvent;
import layers.Layer;

public class Example extends Layer {
    public void onEvent(Event event)
    {
        Dispatcher dispatcher = new Dispatcher(event);
        dispatcher.dispath(Event.Type.MOUSE_PRESSED, (Event e) -> onPressed((MousePressedEvent)e));
        dispatcher.dispath(Event.Type.MOUSE_RELEASED, (Event e) -> ondReleased((MouseReleasedEvent)e));
        dispatcher.dispath(Event.Type.MOUSE_MOVED, (Event e) -> onMoved((MouseMotionEvent)e));
    }

    private boolean onPressed(MousePressedEvent event) {
        System.out.println("Mouse pressed:" + event.getKeyCode());
        return false;
    }

    private boolean ondReleased(MouseReleasedEvent event) {
        System.out.println("Mouse released:" + event.getKeyCode());
        return false;
    }

    private boolean onMoved(MouseMotionEvent event) {
        System.out.println("Mouse released:" + event.getX() + "-" + event.getY());
        return false;
    }
}
