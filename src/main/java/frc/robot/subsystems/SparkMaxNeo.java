package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkMax;


public class SparkMaxNeo extends SubsystemBase {
    
    // Declare motor controllers and encoders as private
    private final SparkMax motor0;
    private final RelativeEncoder encoder0;

    private final SparkMax motor1;
    private final RelativeEncoder encoder1;

    public SparkMaxNeo() {
        // Initialize motor controllers and encoders
        motor0 = new SparkMax(0, SparkLowLevel.MotorType.kBrushless);
        encoder0 = motor0.getEncoder();

        motor1 = new SparkMax(1, SparkLowLevel.MotorType.kBrushless);
        encoder1 = motor1.getEncoder();
    }

    // Method to spin motor 0 at a specific speed
    public void spinMotor0(double speed) {
        motor0.set(speed);
    }

    // Method to get the position of encoder 0
    public double getMotor0Position() {
        return encoder0.getPosition();
    }

    // Method to stop motor 0
    public void stopMotor0() {
        motor0.set(0);
    }

    // Method to spin motor 1 at a specific speed
    public void spinMotor1(double speed) {
        motor1.set(speed);
    }

    // Method to get the position of encoder 1
    public double getMotor1Position() {
        return encoder1.getPosition();
    }

    // Method to stop motor 1
    public void stopMotor1() {
        motor1.set(0);
    }
}
