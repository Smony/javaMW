package sandbox;

import events.Dispatcher;
import events.Event;
import events.types.MouseMotionEvent;
import events.types.MousePressedEvent;
import events.types.MouseReleasedEvent;
import layers.Layer;

import java.awt.*;
import java.util.Random;

import static java.awt.Color.*;

public class Example extends Layer {

    private String name;
    private Color color;
    private Rectangle box;

    private static final Random rand = new Random();

    public Example(String name, Color color)
    {
        this.name = name;
        this.color = color;

        this.box = new Rectangle(rand.nextInt(100) + 150, rand.nextInt(100) + 150, 120, 240);
    }

    public void onEvent(Event event)
    {
        Dispatcher dispatcher = new Dispatcher(event);
        dispatcher.dispath(Event.Type.MOUSE_PRESSED, (Event e) -> onPressed((MousePressedEvent)e));
        dispatcher.dispath(Event.Type.MOUSE_RELEASED, (Event e) -> ondReleased((MouseReleasedEvent)e));
        dispatcher.dispath(Event.Type.MOUSE_MOVED, (Event e) -> onMoved((MouseMotionEvent)e));
    }

    public void onRender(Graphics g)
    {
        g.setColor(color);
        g.fillRect(box.x, box.y, box.width, box.height);

        g.setColor(Color.WHITE);
        g.drawString(name, box.x + 10, box.y + 10);
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
