package sandbox;

import events.Event;
import layers.Layer;

public class Example extends Layer {
    public void onEvent(Event event)
    {
        System.out.println(event);
    }
}
