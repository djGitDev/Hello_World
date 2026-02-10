package ca.uqam.info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void performAddition() {
        //arrange
        Addition addition = new Addition();

        //act

        int expectedResult = addition.add(1, 2);

        //assert
        assertEquals(expectedResult, 3);
    }

}