package org.usfirst.frc4662.ArmSystem.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc4662.ArmSystem.Robot;
import org.usfirst.frc4662.ArmSystem.commands.Arm.*;

/**
 *
 */
public class HomeArm extends CommandGroup {
    
    public  HomeArm() {
       	
    	requires(Robot.armSubSys);
    	
    	addSequential(new ArmOffHome());
    	addSequential(new ArmSetHome());

    }
}
