package org.example;

public class SqrService {
    public int calcNumbers(int firstBorderOfRange, int secondBorderOfRange) {
        int numbers = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= firstBorderOfRange) & (i * i <= secondBorderOfRange)) {
                numbers ++;

            }
        }
        return numbers;
    }
}


