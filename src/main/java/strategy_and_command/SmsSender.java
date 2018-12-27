package strategy_and_command;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class SmsSender implements Sender {
    @Override
    public void send(IDIMessage message) {
        System.out.println(message.getText()+" was sent by sms");
    }

    @Override
    public int myType() {
        return 2;
    }
}
