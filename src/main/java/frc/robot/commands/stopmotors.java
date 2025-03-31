package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.SparkMaxNeo;

public class stopmotors extends InstantCommand {
    public stopmotors(SparkMaxNeo sparkMaxNeo) {
        super(() -> {
            sparkMaxNeo.stopMotor0(); // Stop motor 0
            sparkMaxNeo.stopMotor1(); // Stop motor 1
        }, sparkMaxNeo); // Declare dependency on the SparkMaxNeo subsystem
    }
}
