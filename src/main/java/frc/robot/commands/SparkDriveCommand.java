package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class SparkDriveCommand extends CommandBase {

    public SparkDriveCommand() {
       addRequirements(Robot.leftSpark, Robot.rightSpark);
    }

    public void execute() {
        Robot.leftSpark.drive(Robot.m_oi.leftJoystick.getY());
        Robot.rightSpark.drive(Robot.m_oi.rightJoystick.getY());
    }

    @Override
    public boolean isFinished() {
        return false;

    }
}
