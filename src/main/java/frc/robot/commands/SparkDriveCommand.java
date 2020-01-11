package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.RobotContainer;
import frc.robot.subsystems.LeftSpark;

import java.util.Set;

public class SparkDriveCommand extends CommandBase {

    private LeftSpark leftSpark;
    private final Set<Subsystem> subsystems;

    public SparkDriveCommand(LeftSpark leftSpark) {
        this.leftSpark = leftSpark;
        this.subsystems = Set.of(leftSpark);
    }

    public void execute() {
        leftSpark.drive(RobotContainer.leftJoystick.getY());
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return this.subsystems;
    }
}
