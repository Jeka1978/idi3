package strategy_and_command;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {



        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("strategy_and_command");

        Distributor distributor = context.getBean(Distributor.class);
        IDIMessage message = IDIMessage.builder().text("welcome to IDI").distributionType(1).build();
        distributor.distribute(message);
        distributor.distribute(message.withDistributionType(2));
        distributor.distribute(message.withDistributionType(3));
        distributor.distribute(message.withDistributionType(4));
    }
}
