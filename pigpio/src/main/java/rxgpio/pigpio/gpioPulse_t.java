package rxgpio.pigpio;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class gpioPulse_t extends Structure {
	public int gpioOn;
	public int gpioOff;
	public int usDelay;
	public gpioPulse_t() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("gpioOn", "gpioOff", "usDelay");
	}
	public gpioPulse_t(int gpioOn, int gpioOff, int usDelay) {
		super();
		this.gpioOn = gpioOn;
		this.gpioOff = gpioOff;
		this.usDelay = usDelay;
	}
	public gpioPulse_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends gpioPulse_t implements Structure.ByReference {
		
	};
	public static class ByValue extends gpioPulse_t implements Structure.ByValue {
		
	};
}
