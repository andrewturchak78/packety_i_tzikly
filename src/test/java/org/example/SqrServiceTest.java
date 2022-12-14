package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parametres.csv")

    public void amountOfNumbers(int expected, int firstBorderOfRange, int secondBorderOfRange) {

        SqrService service = new SqrService();

        int actual = service.calcNumbers(firstBorderOfRange, secondBorderOfRange);

        Assertions.assertEquals(actual, expected);
    }
}
