package pigpio4s

import pigpio4s.PigpioLibrary.gpioAlertFunc_t

import scala.util.control.NonFatal


case class GpioAlert(gpio: Gpio, level: Level, tick: Long)

trait GpioWatcher extends gpioAlertFunc_t {
    def onSuccess(alert: GpioAlert): Unit
    def onFailure(t: Throwable): Unit = {}

    final def callback(gpio: Int, level: Int, tick: Int /*UINT32*/): Unit = {
        try onSuccess(GpioAlert(Gpio(gpio), Level(level), tick))
        catch {
            case NonFatal(e) => onFailure(e)
        }
    }
}
