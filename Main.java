import core.Window;
import sandbox.Example;

import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        Window window = new Window("Smony", 960, 640);
        window.addLayer(new Example("Test", Color.BLUE));
        window.addLayer(new Example("Test2", Color.GREEN));
    }
}
