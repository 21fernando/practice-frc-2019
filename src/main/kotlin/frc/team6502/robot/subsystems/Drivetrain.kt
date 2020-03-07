package frc.team6502.robot.subsystems
import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj.SpeedControllerGroup
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.team6502.robot.Constants
import frc.team6502.robot.commands.DefaultDrive

object Drivetrain: SubsystemBase() {

    val leftMaster = CANSparkMax(Constants.LEFT_MASTER_ID, CANSparkMaxLowLevel.MotorType.kBrushless ).apply{
        restoreFactoryDefaults()
        setSmartCurrentLimit(40)
        inverted = false
    }
    val leftSlave  = CANSparkMax(Constants.LEFT_SLAVE_ID, CANSparkMaxLowLevel.MotorType.kBrushless ).apply{
        restoreFactoryDefaults()
        setSmartCurrentLimit(40)
        inverted = false
    }
    val leftSide = SpeedControllerGroup(leftMaster, leftSlave)

    val rightMaster  = CANSparkMax(Constants.RIGHT_MASTER_ID, CANSparkMaxLowLevel.MotorType.kBrushless ).apply{
        restoreFactoryDefaults()
        setSmartCurrentLimit(40)
        inverted = false
    }
    val rightSlave  = CANSparkMax(Constants.RIGHT_SLAVE_ID, CANSparkMaxLowLevel.MotorType.kBrushless ).apply{
        restoreFactoryDefaults()
        setSmartCurrentLimit(40)
        inverted = false
    }

    val rightSide = SpeedControllerGroup(rightMaster, rightSlave)
    val robotDrive = DifferentialDrive(leftSide,rightSide)

    init {
        this.defaultCommand = DefaultDrive()
    }

    fun drive ( speed :Double, rotation:Double){
        robotDrive.arcadeDrive(speed,rotation)
    }

}
