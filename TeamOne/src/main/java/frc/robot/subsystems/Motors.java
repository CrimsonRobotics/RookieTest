package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

class Motors{

    WPI_TalonSRX motor1;
    WPI_TalonSRX motor2;

    // SpeedController speed;
    public Motors(int mID, int mtID) {
       mID = new WPI_TalonSRX(mID);
       mtID = new WPI_TalonSRX(mtID);

       // speed = new SpeedController(motor1);
    }

    public void checkButton(Joystick operator){
        if (operator.getTriggerPressed() == true){
            motor1.setpower(0.4);
        }
    }
}
