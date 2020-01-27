package frc.team6502.robot
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.buttons.JoystickButton
import frc.team6502.robot.Constants

object OI {
    val Joystick = Joystick(Constants.xboxControlllerId)
    val controllerLeftY: Double
        get() = Joystick.getRawAxis(Constants.leftYAxis)
    val controllerLeftX: Double
        get() = Joystick.getRawAxis(Constants.leftXAxis)
    val controllerRightY: Double
        get() = Joystick.getRawAxis(Constants.rightYAxis)
    val controllerRightX: Double
        get() = Joystick.getRawAxis(Constants.rightXAxis)
    init{

    }
}