package strategy_and_command;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ViberSender implements Sender {
    @Override
    public void send(IDIMessage message) {
        System.out.println("Sent by skype");
    }

    @Override
    public int myType() {
        return 5;
    }
}
