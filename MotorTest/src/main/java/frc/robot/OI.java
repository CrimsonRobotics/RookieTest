/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.RunMotor;
import frc.robot.commands.StopMotor;

public class OI {

  public Joystick Driver = new Joystick(0);
  public JoystickButton Button = new JoystickButton(Driver, 2);

  public OI () {
    Button.whenPressed(new RunMotor());
    
    Button.whenReleased(new StopMotor());
  }
}
