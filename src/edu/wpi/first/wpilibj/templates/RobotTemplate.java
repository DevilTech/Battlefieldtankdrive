
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.*;


public class RobotTemplate extends SimpleRobot {
    Victor vicky;
    Victor vlad;
    RobotDrive diego;
    Joystick john;
    boolean button1;
    boolean button2;
    JoyButton butt;
    double time;
    
    public void robotInit(){
        vicky = new Victor(2);
        vlad = new Victor(4);
        john = new Joystick(1);
        diego = new RobotDrive(vlad, vicky);
        button1 = false;
        button2 = true;
        butt = new JoyButton(john);
        time = 1.0/16;
    }
    public void autonomous() {
        
    }

   
    public void operatorControl() {
        while(isEnabled()){
            diego.arcadeDrive(john.getX()/2, john.getY());
             if(butt.isNewPress(butt.lback)){
                vlad.set(.5);
                vicky.set(.5);
                Timer.delay(time);
                vlad.set(0);
                vicky.set(0);
            }
            else if(butt.isNewPress(butt.rback)){
                vlad.set(-.5);
                vicky.set(-.5);
                Timer.delay(time);
                vicky.set(0);
                vlad.set(0);
        }
        }
    }
    
    
    public void test() {
    
    }
}
    
