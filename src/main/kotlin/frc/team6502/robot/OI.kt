package frc.team6502.robot

object OI {
    val Joystick = edu.wpi.first.wpilibj.Joystick(Constants.JOSYSTICK_ID)
    val controllerLeftY: Double
        get() = Joystick.getRawAxis(Constants.LEFT_Y_AXIS)
    val controllerLeftX: Double
        get() = Joystick.getRawAxis(Constants.LEFT_X_AXIS)
    val controllerRightY: Double
        get() = Joystick.getRawAxis(Constants.RIGHT_Y_AXIS)
    val controllerRightX: Double
        get() = Joystick.getRawAxis(Constants.RIGHT_X_AXIS)
}