package org.usfirst.frc4662.ArmSystem.commands.Arm;

import org.usfirst.frc4662.ArmSystem.Robot;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class JoystickArmMove extends Command {

    public JoystickArmMove() {
        requires(Robot.armSubSys);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.armSubSys.moveArm(Robot.oi.joystick1.getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.armSubSys.stopArm();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
