package strategy_and_command;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class MailSender implements Sender {
    @Override
    public void send(IDIMessage message) {
        System.out.println(message.getText()+" was sent by mail");
    }

    @Override
    public int myType() {
        return 1;
    }
}
