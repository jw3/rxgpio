package rxgpio

import rxgpio.pigpio.{PigpioLibrary => lib}

sealed trait PinMode {
    def value: Int
}

case object InputPin extends PinMode {val value = lib.PI_INPUT}
case object OutputPin extends PinMode {val value = lib.PI_OUTPUT}

object PinMode {
    def apply(value: Int) = value match {
        case lib.PI_INPUT => InputPin
        case lib.PI_OUTPUT => OutputPin
        case _ => throw BadMode()
    }
}

object PinModes {
    val input = InputPin
    val output = OutputPin
}