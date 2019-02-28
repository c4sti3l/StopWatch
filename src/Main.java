import controller.MainController;

/**
 * This example code demonstrates how to perform simple state
 * control of a GPIO pin on the Raspberry Pi.
 *
 * @author Robert Savage
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
    	MainController mc = new MainController();
    	mc.showMainGui();
    		
    }
}