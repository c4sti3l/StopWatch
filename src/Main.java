import controller.LEDController;

/**
 * This example code demonstrates how to perform simple state
 * control of a GPIO pin on the Raspberry Pi.
 *
 * @author Robert Savage
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
    		LEDController ledController = new LEDController();
    		ledController.setColor("green");
    		Thread.sleep(1000);
    		ledController.setColor("red");
    		Thread.sleep(1000);
    		ledController.setColor("green");
    		Thread.sleep(1000);
    		ledController.setColor("red");
    		Thread.sleep(1000);
    		
    }
}