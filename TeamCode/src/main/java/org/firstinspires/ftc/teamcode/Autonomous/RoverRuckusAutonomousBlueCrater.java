package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "RoverRuckusAutonomous Blue Crater", group = "Blue")
public class RoverRuckusAutonomousBlueCrater extends BaseRoverRuckusAuto {

    public RoverRuckusAutonomousBlueCrater() {
        super();
        startCorner = StartCorner.BLUE_CRATER;
        xStart = 18;
        yStart = -18;
        angleStart  = -45;

    }
}
