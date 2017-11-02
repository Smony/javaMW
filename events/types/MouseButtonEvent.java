package events.types;

import events.Event;

public class MouseButtonEvent extends Event {

    private int x, y, keyCode;

    protected MouseButtonEvent(Type type, int x, int y, int keyCode) {
        super(type);
        this.x = x;
        this.y = y;
        this.keyCode = keyCode;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getKeyCode(){
        return keyCode;
    }
}
