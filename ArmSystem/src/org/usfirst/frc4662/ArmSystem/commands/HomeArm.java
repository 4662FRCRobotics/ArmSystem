package org.usfirst.frc4662.ArmSystem.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc4662.ArmSystem.Robot;
import org.usfirst.frc4662.ArmSystem.commands.Arm.*;

/**
 *
 */
public class HomeArm extends CommandGroup {
    
    public  HomeArm() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	
    	requires(Robot.armSubSys);
    	
    	addSequential(new ArmOffHome());
    	addSequential(new ArmSetHome());

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
