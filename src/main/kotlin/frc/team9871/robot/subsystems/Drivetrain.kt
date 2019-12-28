package frc.team9871.robot.subsystems
import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.team9871.robot.Constants
import frc.team9871.robot.commands.DefaultDrive

object Drivetrain: SubsystemBase() {

    val leftMaster = TalonSRX(Constants.leftMasterId)
    val leftSlave  = TalonSRX(Constants.leftSlaveId)
    val rightMaster  = TalonSRX(Constants.rightMasterId)
    val rightSlave  = TalonSRX(Constants.rightSlaveId)

    init {
        this.defaultCommand = DefaultDrive()
        leftSlave.follow(leftMaster)
        rightSlave.follow(rightMaster)
        leftMaster.setInverted(true)
        leftSlave.setInverted(true)
    }
    fun set ( Left :Double, Right:Double){
        leftMaster.set(ControlMode.PercentOutput, Left)
        rightMaster.set(ControlMode.PercentOutput, Right)

    }

}
