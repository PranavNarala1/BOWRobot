package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.SparkDriveCommand;

public class LeftSpark extends SubsystemBase {
    private Spark leftFrontMotor;
    private Spark leftBackMotor;
    private Spark leftMiddleMotor;

    public void drive(double leftspeed) {
        System.out.println("Left value is "+leftspeed);
        leftFrontMotor.setSpeed(leftspeed);
//        leftBackMotor.setSpeed(leftspeed);
//        leftMiddleMotor.setSpeed(leftspeed);
    }

    public LeftSpark() {
        leftFrontMotor = new Spark(0);
//        leftBackMotor = new Spark(1);
//        leftMiddleMotor = new Spark(2);

    }

    protected void initDefaultCommand() {
//        setDefaultCommand(new SparkDriveCommand());
    }
}
