import core.Window;
import sandbox.Example;

public class Main {

    public static void main(String[] args)
    {
        Window window = new Window("Smony", 960, 640);
        window.addLayer(new Example());
    }
}
