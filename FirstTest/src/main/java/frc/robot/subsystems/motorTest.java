package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;

class motorTest extends Subsystem{
    WPI_TalonSRX motor1;
    WPI_TalonSRX motor2;

    @Override
    protected void initDefaultCommand() {
        
    }

    public motorTest(int 1, int 2){
        motor1 = new WPI_TalonSRX(1);
        motor2 = new WPI_TalonSRX(2);

        //Joystick stick = new Joystick();
    }

    public void moveTalon(){
        motor1.set(.4);
        motor2.set(-.4);
    }
    public void noMoveTalon(){
        motor1.set(0);
        motor2.set(0);
    }
}