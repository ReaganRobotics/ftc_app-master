package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by tyler on 12/10/2016.
 */
@Autonomous(name="TesterAuto", group="TesterAuto")
public class TesterAuto extends LinearOpMode{
    DcMotor driveOne, driveTwo, driveThree;
    private ElapsedTime runtime = new ElapsedTime();
    public void runOpMode() throws InterruptedException{
        driveOne = hardwareMap.dcMotor.get("driveOne");
        driveTwo = hardwareMap.dcMotor.get("driveTwo");
        driveThree = hardwareMap.dcMotor.get("driveThree");
        waitForStart();

        driveTwo.setPower(-1.0);
        driveThree.setPower(1.0);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.9)) {
            idle();
        }

        driveTwo.setPower(0);
        driveThree.setPower(0);
    }
}
