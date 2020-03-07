package frc.team6502.robot.commands

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team6502.robot.OI
import frc.team6502.robot.subsystems.Drivetrain

class DefaultDrive: CommandBase() {

    init {
        addRequirements(Drivetrain)
    }
    override fun initialize() {

    }
    override fun execute() {
        Drivetrain.drive(OI.controllerLeftY, OI.controllerRightX)
    }

    override fun isFinished() = false
}