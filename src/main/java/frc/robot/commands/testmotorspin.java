package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.SparkMaxNeo;

public class testmotorspin extends Command {
    private final SparkMaxNeo sparkMaxNeo;
    private final double speed;
    private final double rotations;
    private double initialPosition;

    public testmotorspin(SparkMaxNeo sparkMaxNeo, double speed, double rotations) {
        this.sparkMaxNeo = sparkMaxNeo;
        this.speed = speed;
        this.rotations = rotations;
        addRequirements(sparkMaxNeo); // Declare subsystem dependencies
    }

    @Override
    public void initialize() {
        // Record the initial encoder position
        initialPosition = sparkMaxNeo.getMotor0Position();
        // Start spinning the motor at the specified speed
        sparkMaxNeo.spinMotor0(speed);
    }

    @Override
    public void execute() {
        // No additional logic needed here; motor is already spinning
    }

    @Override
    public void end(boolean interrupted) {
        // Stop the motor when the command ends
        sparkMaxNeo.spinMotor0(0);
    }

    @Override
    public boolean isFinished() {
        // Check if the motor has spun the desired number of rotations
        double currentPosition = sparkMaxNeo.getMotor0Position();
        return (currentPosition - initialPosition) >= rotations;
    }
}
