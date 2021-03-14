package org.firstinspires.ftc.teamcode.Subsystems.Drive;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;

@Config
public class PoseLibrary {

    // Starting positions
    public static Pose2d START_POS_BLUE_2 = new Pose2d(-54.75, 26.5, Math.toRadians(0.0));
    public static Pose2d START_POS_BLUE_1 = new Pose2d(-54.75, 48, Math.toRadians(0.0));

    //transfer pose between opmodes, defaults to auto starting pose for testing
    public static Pose2d AUTO_ENDING_POSE = new Pose2d(-55, 26.5, Math.toRadians(0.0));

    //common shooting poses
    public static Pose2d_RPM SHOOTING_POSE_A = new Pose2d_RPM(-4, 55, Math.toRadians(-25.0), 3300); //used in auto path A
    public static Pose2d_RPM SHOOTING_POSE_BC = new Pose2d_RPM(6.8066, 26.37388, Math.toRadians(-5), 3400); //used in auto path B and C


    //automatic power shot poses
    public static Pose2d_RPM POWER_SHOT_START_POSE = new Pose2d_RPM(10, 72-8.5, Math.toRadians(0.0), 2900);
    public static Pose2d_RPM POWER_SHOT_POSE_1 = new Pose2d_RPM(0, 31.5, Math.toRadians(-21), 2900);
    public static Pose2d_RPM POWER_SHOT_POSE_2 = new Pose2d_RPM(0, 24, Math.toRadians(-21), 2900);
    public static Pose2d_RPM POWER_SHOT_POSE_3 = new Pose2d_RPM(0, 16.5, Math.toRadians(-21), 2900);

    public static Pose2d_RPM[] POWER_SHOT_POSES = {POWER_SHOT_START_POSE, POWER_SHOT_POSE_1, POWER_SHOT_POSE_2, POWER_SHOT_POSE_3};


}
