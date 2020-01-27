package frc.team6502.robot.subsystems
import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.team6502.robot.Constants
import frc.team6502.robot.commands.DefaultDrive

object Drivetrain: SubsystemBase() {

    val leftMaster = CANSparkMax(Constants.leftMasterId, CANSparkMaxLowLevel.MotorType.kBrushless )
    val leftSlave  = CANSparkMax(Constants.leftSlaveId, CANSparkMaxLowLevel.MotorType.kBrushless )
    val rightMaster  = CANSparkMax(Constants.rightMasterId, CANSparkMaxLowLevel.MotorType.kBrushless )
    val rightSlave  = CANSparkMax(Constants.rightSlaveId, CANSparkMaxLowLevel.MotorType.kBrushless )

    init {
        this.defaultCommand = DefaultDrive()
        leftSlave.follow(leftMaster, true)
        rightSlave.follow(rightMaster, true)
    }
    fun set ( Left :Double, Right:Double){
        leftMaster.set(Left)
        rightMaster.set(Right)

    }

}
