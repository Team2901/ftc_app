package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name = "GoToPositionTest", group = "Test")
public class GoToPositionTest extends BaseRoverRuckusAuto {

    public GoToPositionTest() {
        super();
        startCorner = StartCorner.BLUE_CRATER;
        xStart = 0;
        yStart = 0;
        angleStart  = 0;

    }

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        telemetry.addData("startCorner", startCorner);
        telemetry.update();

        goToPosition(xStart, yStart, 24, 24);

        waitForStart();

        goToPosition(24, 24, -24, -24);
    }
}