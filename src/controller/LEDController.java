package controller;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class LEDController {

	private final GpioPinDigitalOutput pinRed;
	private final GpioPinDigitalOutput pinGreen;

	public LEDController() throws InterruptedException {
		final GpioController gpio = GpioFactory.getInstance();
		pinRed = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "MyLED",
				PinState.LOW);
		pinGreen = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "MyLED",
				PinState.LOW);

		pinGreen.high();
		pinRed.high();
	}

	public void setColor(String color) {
		off();
		switch (color) {
		case "green":
			pinGreen.low();
			break;
		case "red":
			pinRed.low();
			break;
		}
	}

	public void off() {
		pinGreen.high();
		pinRed.high();
	}
}
