package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RightSpark extends SubsystemBase {
    private Spark rightFrontMotor;
    private Spark rightBackMotor;
    private Spark rightMiddleMotor;

    public void drive(double rightspeed) {
        rightFrontMotor.setSpeed(rightspeed);
//        rightBackMotor.setSpeed(rightspeed);
//        rightMiddleMotor.setSpeed(rightspeed);
    }

    public RightSpark() {
        rightFrontMotor = new Spark(1);
//        rightBackMotor = new Spark(1);
//        rightMiddleMotor = new Spark(2);

    }

    protected void initDefaultCommand() {
//        setDefaultCommand(new DriveCommand());
    }
}
