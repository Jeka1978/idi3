package strategy_and_command;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WhatsappSender implements Sender {
    @Override
    public void send(IDIMessage message) {
        System.out.println(message.getText()+" was sent by viber");
    }

    @Override
    public int myType() {
        return 4;
    }
}
