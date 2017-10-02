package org.usfirst.frc.team6624.robot;

import edu.wpi.first.wpilibj.XboxController;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static XboxController xbox = new XboxController(RobotMap.xboxPort);
	
	public static int xboxLeftX = 0;
	public static int xboxLeftY = 1;
	public static int xboxRightX = 4;
	public static int xboxRightY = 5;
}
