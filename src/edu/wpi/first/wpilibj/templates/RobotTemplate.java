
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;


public class RobotTemplate extends SimpleRobot {
    Victor vicky;
    Victor vlad;
    RobotDrive diego;
    Joystick john;
    
    public void robotInit(){
        vicky = new Victor(2);
        vlad = new Victor(3);
        john = new Joystick(1);
        diego = new RobotDrive(vlad, vicky);
    }
    public void autonomous() {
        
    }

   
    public void operatorControl() {
        while(isEnabled()){
            diego.arcadeDrive(john.getZ(), john.getX(), true);
            if
        }
    }
    
    
    public void test() {
    
    }
}
