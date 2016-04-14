package org.jointheleague.iaroc;

import android.os.SystemClock;

import ioio.lib.api.IOIO;
import ioio.lib.api.exception.ConnectionLostException;
import org.wintrisstech.irobot.ioio.IRobotCreateAdapter;
import org.wintrisstech.irobot.ioio.IRobotCreateInterface;
import org.jointheleague.iaroc.sensors.UltraSonicSensors;

public class Brain extends IRobotCreateAdapter {
    private final Dashboard dashboard;
    public UltraSonicSensors sonar;
    int y = 0;
    public Brain(IOIO ioio, IRobotCreateInterface create, Dashboard dashboard)
            throws ConnectionLostException {
        super(create);
        sonar = new UltraSonicSensors(ioio);
        this.dashboard = dashboard;
        boolean isBumpRight;
        boolean isBumpLeft;
    }

    /* This method is executed when the robot first starts up. */
    public void initialize() throws ConnectionLostException {

        dashboard.log("Hello! I'm a Clever Robot!");
        //what would you like me to do, Clever Human?
        readSensors(SENSORS_ANGLE);
        readSensors(SENSORS_BUMPS_AND_WHEEL_DROPS);

        //int x =  getAngle();
      /*   dashboard.log(getAngle()+"");
        driveDirect(100, 100);
        SystemClock.sleep(700);
        driveDirect(500, -500);
        SystemClock.sleep(470);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle() + "");
        driveDirect(100, 100);
        SystemClock.sleep(700);
        driveDirect(500, -500);
        SystemClock.sleep(470);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle() + "");
        driveDirect(100,100);
        SystemClock.sleep(700);
        driveDirect(500,-500);
        SystemClock.sleep(470);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle()+"");
        driveDirect(100,100);
        SystemClock.sleep(700);
        driveDirect(500,-500);
        SystemClock.sleep(470);
        driveDirect(0, 0);
        dashboard.log*/
        /*driveDirect(100,-100);
        SystemClock.sleep(3000);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle() + "");
        driveDirect(0,0);*/
       // driveDirect(300, 300);













    }
    /* This method is called repeatedly. */
    public void loop() throws ConnectionLostException {
        /*driveDirect(100, 100);
        SystemClock.sleep(700);
        driveDirect(500, -500);
        SystemClock.sleep(470);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle() + "");
        y += getAngle();
        dashboard.log(y + "");*/
       /* driveDirect(200, 200);
        SystemClock.sleep(900);
        driveDirect(100, -100);
        SystemClock.sleep(3000);
        readSensors(SENSORS_ANGLE);
        dashboard.log(getAngle() + "");
        y += getAngle();
        if(y == 120){
            driveDirect(0,0);*/
        driveDirect(300, 300);
        readSensors(SENSORS_ANGLE);
        readSensors(SENSORS_BUMPS_AND_WHEEL_DROPS);
        if (isBumpRight()) {
            dashboard.log("ouch right");
            driveDirect(500, -500);
            SystemClock.sleep(470);
            driveDirect(-100, -100);
            SystemClock.sleep(700);

            driveDirect(0,0);
        }
        else if(isBumpLeft()) {
            dashboard.log("ouch left");
            driveDirect(-500, 500);
            SystemClock.sleep(470);
            driveDirect(-100, -100);
            SystemClock.sleep(700);

            driveDirect(0,0);
        }



    }



    }
