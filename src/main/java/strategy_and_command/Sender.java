package strategy_and_command;

/**
 * @author Evgeny Borisov
 */
public interface Sender {
    void send(IDIMessage message);
    int myType();
}
