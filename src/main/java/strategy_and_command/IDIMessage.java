package strategy_and_command;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Wither;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@Wither
public class IDIMessage {
    private String text;
    private String address;
    private int distributionType;
}
