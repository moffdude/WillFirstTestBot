package org.usfirst.frc.team3255.robot.subsystems;

import org.usfirst.frc.team3255.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
   
	//Talons
	Talon leftTalon = null;
	Talon rightTalon = null;
	
	//Encoders
	Encoder encoder = null;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void init( ){
		leftTalon = new Talon(RobotMap.LEFT_TALON);
		rightTalon = new Talon(RobotMap.RIGHT_TALON);
		
		encoder = new Encoder(RobotMap.ENCODER_CHA, RobotMap.ENCODER_CHB);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

