package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.println( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long result = calculator.sum( number1, number2 );

        System.out.println( number1 + " + " + number2 + " = " + result );

        Long resultSub = calculator.subtract( number1, number2 );

        System.out.println( number1 + " - " + number2 + " = " + resultSub );

        Long resultTimes = calculator.times( number1, number2 );

        System.out.println( number1 + " * " + number2 + " = " + resultTimes );

        Long resultDivision = calculator.division( number1, number2 );

        System.out.println( number1 + " / " + number2 + " = " + resultDivision );
    }
}
