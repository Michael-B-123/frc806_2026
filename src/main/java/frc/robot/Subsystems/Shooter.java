import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    public Shooter(int motorId) {

    }

    // _If_ we need a third state where motor does not turn, turn off the motor
    // when leaving the other two states and have no default command.

    public Command prime() {
        // Default command, rotate slowly to reduce shooting prep time
        return runOnce(() -> {});
    }

    public Command shoot() {
        // Speed up rollers, control velocty
        // https://docs.wpilib.org/en/stable/docs/software/advanced-controls/introduction/tuning-flywheel.html
        return runOnce(() -> {});
    }

    @Override
    public void initSendable(SendableBuilder builder) {

    }
}
