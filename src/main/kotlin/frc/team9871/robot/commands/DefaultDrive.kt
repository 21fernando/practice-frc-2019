package frc.team9871.robot.commands

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team9871.robot.OI
import frc.team9871.robot.subsystems.Drivetrain

class DefaultDrive: CommandBase() {
    var prevThrottle = 0.0
    var throttleOut = 0.0
    var prevRotation = 0.0
    var rotationOut = 0.0
    val scale = 0.05
    val speedCap = 0.5

    init {
        addRequirements(Drivetrain)
    }
    override fun initialize() {

    }
    override fun execute() {
        var throttle = OI.controllerLeftY
        var rotation = OI.controllerRightX
        if (throttle != prevThrottle) {
            throttleOut += (throttle - prevThrottle) * scale
        }
        prevThrottle = throttleOut
        if (rotation!=prevRotation) {
            rotationOut += (rotation - prevRotation) * scale
        }
        var leftOut = throttle+(-0.2*rotation)
        var rightOut = throttle+(0.2*rotation)
        Drivetrain.set(leftOut * speedCap, rightOut * speedCap)
    }

    override fun isFinished() = false
}