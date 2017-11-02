package events.types;

public class MouseReleasedEvent extends MouseButtonEvent {
    public MouseReleasedEvent(int x, int y, int keyCode) {
        super(Type.MOUSE_RELEASED, x, y, keyCode);
    }
}
