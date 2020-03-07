package frc.team6502.robot.subsystems
import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.SpeedControllerGroup
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.team6502.robot.Constants
import frc.team6502.robot.commands.DefaultDrive

object Drivetrain: SubsystemBase() {

    val leftMaster = Spark(Constants.LEFT_MASTER_ID)
    val leftSlave  = Spark(Constants.LEFT_SLAVE_ID)
    val leftSide = SpeedControllerGroup(leftMaster, leftSlave)
    val rightMaster  = Spark(Constants.RIGHT_MASTER_ID)
    val rightSlave  = Spark(Constants.RIGHT_SLAVE_ID)
    val rightSide = SpeedControllerGroup(rightMaster, rightSlave)
    val robotDrive = DifferentialDrive(leftSide,rightSide)

    init {
        this.defaultCommand = DefaultDrive()
    }


    var frontIsFront = 1

    fun switchFrontIsFront(){
        frontIsFront*=-1
    }

    fun drive ( speed :Double, rotation:Double){
        robotDrive.arcadeDrive(speed,rotation)
    }

}
