package org.usfirst.frc.team6624.robot.commands;

import org.ControlSchemeLesson.ControlSchemeLesson;
import org.usfirst.frc.team6624.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This command handles the student written code.
 */
public class DriveContinuous extends Command {

	ControlSchemeLesson scheme;
	
    public DriveContinuous() {
    	requires(Robot.drive);
    	
    	scheme = new ControlSchemeLesson();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	scheme.setup();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	scheme.update();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.setLeftDriveTrain(0);
    	Robot.drive.setRightDriveTrain(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
}
