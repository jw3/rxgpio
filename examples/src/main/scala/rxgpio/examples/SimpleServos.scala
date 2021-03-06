package rxgpio.examples

import rxgpio._
import rxgpio.pigpio.PigpioLibrary

import scala.util.Success

/**
 *
 */
object SimpleServos extends App {
    import rxgpio.Gpio.Implicits._

    DefaultInitializer.gpioInitialise() match {
        case Success(InitOK(ver)) =>
            println(s"initialized pigpio:$ver")
        case _ =>
            println("failed")
            System.exit(1)
    }
    implicit val pigpio = PigpioLibrary.Instance

    for (i <- 500 to 2400 by 50) {
        DefaultAnalogIO.gpioServo(1, ServoPulseWidth(i))
        DefaultAnalogIO.gpioServo(2, ServoPulseWidth(i))

        Thread.sleep(500)
    }

    Thread.sleep(500)

    DefaultAnalogIO.gpioServo(1, ServoPulseWidth(500))
    DefaultAnalogIO.gpioServo(2, ServoPulseWidth(500))

    Thread.sleep(1000)

    DefaultAnalogIO.gpioServo(1, ServoPulseWidth(0))
    DefaultAnalogIO.gpioServo(2, ServoPulseWidth(0))
}
