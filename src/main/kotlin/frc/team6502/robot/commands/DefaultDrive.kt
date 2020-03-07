package frc.team6502.robot.commands

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team6502.robot.OI
import frc.team6502.robot.subsystems.Drivetrain
import java.lang.Exception

class DefaultDrive: CommandBase() {


    init {
        addRequirements(Drivetrain)
    }
    override fun initialize() {

    }

    override fun execute() {
        /*
        SmartDashboard.putNumber("Y AXIS:" , OI.controllerY)
        SmartDashboard.putNumber("Z AXIS:" , OI.controllerZ)
         */
        /*try {
            Shuffleboard.getTab("Test").addNumber("Y") { OI.controllerY }
            Shuffleboard.getTab("Test").addNumber("Z") { OI.controllerZ }
        } catch (e: Exception) {
            e.printStackTrace()
        }*/
        Drivetrain.drive(OI.controllerY*Drivetrain.frontIsFront, OI.controllerZ)
    }

    override fun isFinished() = false
}