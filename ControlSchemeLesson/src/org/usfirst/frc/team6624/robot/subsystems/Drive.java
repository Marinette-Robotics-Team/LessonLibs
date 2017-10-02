package org.usfirst.frc.team6624.robot.subsystems;

import org.usfirst.frc.team6624.robot.RobotMap;
import org.usfirst.frc.team6624.robot.commands.DriveContinuous;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Drive subsystem. Controls discrete tank drive drivetrains
 */
public class Drive extends Subsystem {
	
	Spark FRONT_LEFT_MOTOR = new Spark(RobotMap.frontLeftMotorPort);
	Spark FRONT_RIGHT_MOTOR = new Spark(RobotMap.frontRightMotorPort);
	Spark REAR_LEFT_MOTOR = new Spark(RobotMap.backLeftMotorPort);
	Spark REAR_RIGHT_MOTOR = new Spark(RobotMap.backRightMotorPort);
	

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveContinuous());
    }
    
    public void setLeftDriveTrain(double speed)
    {
    	if (Math.abs(speed) > 1.0) {
    		throw new IllegalArgumentException("speed must be between -1 and 1");
    	}
    	
    	FRONT_LEFT_MOTOR.set(speed);
    	REAR_LEFT_MOTOR.set(speed);
    }
    
    public void setRightDriveTrain(double speed) {
    	if (Math.abs(speed) > 1.0) {
    		throw new IllegalArgumentException("speed must be between -1 and 1");
    	}
    	
    	FRONT_RIGHT_MOTOR.set(speed);
    	REAR_RIGHT_MOTOR.set(speed);
    }
}

