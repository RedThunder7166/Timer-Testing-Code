/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.ExampleSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class TEST_TEST_TEST extends SequentialCommandGroup {
  /**
   * Creates a new TEST_TEST_TEST.
   */
  public TEST_TEST_TEST(ExampleSubsystem motor) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(new ExampleCommand(motor, 0.01).withTimeout(5)
    );
    
  }
  //, new WaitCommand(10), new ExampleCommand(motor, -0.4).deadlineWith(new WaitCommand(2))
}
