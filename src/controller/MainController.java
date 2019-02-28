package controller;

import classes.BufferedImage;
import classes.JFrame;

public class MainController {

	private LEDController ledController;

	public MainController() {
		ledController = new LEDController();

	}
	
	public void showMainGui(){
		System.out.println("Zeige MainUI");
		

		// elsewhere
		BufferedImage myImage = ImageIO.read(...);
		JFrame myJFrame = new JFrame("Image pane");
		myJFrame.setContentPane(new ImagePanel(myImage));
	}
	
	

	public void turnLightsOn() {
		try {
			ledController = new LEDController();
			ledController.setColor("green");
			Thread.sleep(1000);
			ledController.setColor("red");
			Thread.sleep(1000);
			ledController.setColor("green");
			Thread.sleep(1000);
			ledController.setColor("red");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
