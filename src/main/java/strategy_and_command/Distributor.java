package strategy_and_command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;

/**
 * @author Evgeny Borisov
 */
@Service
public class Distributor {


    private Map<Integer, Sender> map = new HashMap<>();

    @Autowired
    public Distributor(List<Sender> list) {

        map = list.stream().collect(Collectors.toMap(Sender::myType, x -> x));
    }

    public void distribute(IDIMessage message) {
        int type = message.getDistributionType();
        Sender sender = map.get(type);
        if (sender == null) {
            throw new IllegalStateException(type + " not supported yet");
        }

        sender.send(message);
    }


}
