package chain_of_responsibility;

import org.springframework.core.Ordered;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public interface PersonValidator extends Ordered {
   Stream<String> validate(Person person);

   @Override
   default int getOrder(){
      return Ordered.LOWEST_PRECEDENCE;
   }
}
