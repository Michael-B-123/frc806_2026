import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Indexer extends SubsystemBase {
    public Indexer(int bottomRollerMotorId, int topRollerMoterId) {

    }

    // No default command

    public Command index() {
        // Spin motors at correct duty cycles. We should not need controllers.
        return runOnce(() -> {});
    }

    @Override
    public void initSendable(SendableBuilder builder) {

    }
}
