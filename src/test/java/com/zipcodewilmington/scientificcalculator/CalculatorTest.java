package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {


    public void testShowsDisplayValue() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 5;
        double expectedDisplay = 5;
        // When
        double actualDisplay = display.changeDisplayToInput(currentDisplay);
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testChangeDisplayToInput() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 4;
        double displayToBeChangedTo = 10;
        double expectedDisplay = 10;
        // When
        double actualDisplay = display.changeDisplayToInput(displayToBeChangedTo);
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testRevertToZero() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 7;
        double expectedDisplay = 0;
        // When
        double actualDisplay = display.revertToZero();
        // Then
        assertEquals(expectedDisplay, actualDisplay);
    }

    public void testAddition() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 2;
        double userInput = 2;
        double expectedValue = 4;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.addition(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSubtraction() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 4;
        double userInput = 2;
        double expectedValue = 2;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.subtraction(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testDivision() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 20;
        double userInput = 2;
        double expectedValue = 10;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.division(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testDivision1() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 20;
        double userInput = 0;
        double expectedValue = 0;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.division(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testMultiplication() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 10;
        double userInput = 2;
        double expectedValue = 20;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.multiplication(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSquare() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 10;
        double expectedValue = 100;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.square();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSquareRoot() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 16;
        double expectedValue = 4;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.squareRoot();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testSquareRoot1() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = -6;
        double expectedValue = 0;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.squareRoot();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testExponentiation() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 5;
        double userInput = 3;
        double expectedValue = 125;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.exponentiation(userInput);
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testInverse() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 5;
        double expectedValue = .2;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.inverse();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testSwitchSign() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 5;
        double expectedValue = -5;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.switchSign();
        // Then
        assertEquals(expectedValue,actualValue);
    }

    public void testShowFraction1() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = .005;
        String expectedValue = "5/1000";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction2() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 7;
        String expectedValue = "7/1";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction3() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 8.33;
        String expectedValue = "8 and 33/100";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testShowFraction4() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 0;
        String expectedValue = "0";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.showFraction();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testCubed() {
        // Given
        Calculator display = new Calculator();
        double currentDisplay = 7;
        double expectedValue = 343;
        // When
        display.changeDisplayToInput(currentDisplay);
        double actualValue = display.cubed();
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testSwitchDisplayMode() {
        // Given
        Calculator display = new Calculator();
        String modeInputByUser = "binary";
        double currentDisplay = 20;
        String expectedValue = "10100";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.switchDisplayMode(modeInputByUser);
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testSwitchDisplayMode1() {
        // Given
        Calculator display = new Calculator();
        String modeInputByUser = "octal";
        double currentDisplay = 20;
        String expectedValue = "24";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.switchDisplayMode(modeInputByUser);
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testSwitchDisplayMode2() {
        // Given
        Calculator display = new Calculator();
        String modeInputByUser = "hex";
        double currentDisplay = 20;
        String expectedValue = "14";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.switchDisplayMode(modeInputByUser);
        // Then
        assertEquals(expectedValue,actualValue);
    }
    public void testSwitchDisplayMode3() {
        // Given
        Calculator display = new Calculator();
        String modeInputByUser = "anything other than 'hex' 'octal' 'binary'";
        double currentDisplay = 20;
        String expectedValue = "20.0";
        // When
        display.changeDisplayToInput(currentDisplay);
        String actualValue = display.switchDisplayMode(modeInputByUser);
        // Then
        assertEquals(expectedValue,actualValue);
    }
}