package frc.team6502.robot

object OI {
    val Joystick = edu.wpi.first.wpilibj.Joystick(Constants.JOSYSTICK_ID)
    val controllerZ: Double
        get() = Joystick.z
    val controllerX: Double
        get() = Joystick.x
}