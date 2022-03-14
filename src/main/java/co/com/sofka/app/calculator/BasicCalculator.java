package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtract(Long number1, Long number2){
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long times(Long number1, Long number2){
        logger.info( " {} times {}", number1, number2 );
        return number1 * number2;
    }
}
