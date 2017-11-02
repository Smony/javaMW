package events.types;

public class MousePressedEvent extends MouseButtonEvent {
    public MousePressedEvent(int x, int y, int keyCode) {
        super(Type.MOUSE_PRESSED, x, y, keyCode);
    }
}
