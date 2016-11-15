// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4662.ArmSystem;

import org.usfirst.frc4662.ArmSystem.commands.*;
import org.usfirst.frc4662.ArmSystem.commands.Arm.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4662.ArmSystem.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    public Joystick joystick1;
    public JoystickButton homeButton;
    public JoystickButton setpointUp;
    public JoystickButton setpointDown;
    public JoystickButton enableSetpoint;
    
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick1 = new Joystick(0);

        setpointUp = new JoystickButton(joystick1, 5);
        setpointUp.whenPressed(new ArmUpSetpoint());
        
        setpointDown = new JoystickButton(joystick1, 7);
        setpointDown.whenPressed(new ArmDownSetpoint());
        
        enableSetpoint = new JoystickButton(joystick1,6);
        enableSetpoint.whenPressed(new ArmEnableSetpoint());
        
        homeButton = new JoystickButton(joystick1, 8);
        homeButton.whenPressed(new ArmHome());
        
        // SmartDashboard Buttons
//        SmartDashboard.putData("ArmHome", new ArmHome());
 
    }

    public Joystick getJoystick1() {
        return joystick1;
    }

}

