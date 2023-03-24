package org.calculator;

import org.junit.jupiter.api.Test;

import java.text.Format;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  
  @Test
  void add() {
    float big = Float.MAX_VALUE;
    assertEquals(5.5, Calculator.add(2.3F, 3.2F));
    assertThrows(IllegalArgumentException.class, () -> {
      Calculator.add(big * 2, big * 2);
    });
  }
  
  @Test
  void subtract() {
    assertEquals(5.5F, Calculator.subtract(10.1F, 4.6F));
  }
  
  @Test
  void divide() {
    assertEquals(2.4F, Calculator.divide(12F, 5F));
    assertThrows(ArithmeticException.class, () -> {
      Calculator.divide(15F, 0F);
    });
  }
  
  @Test
  void multiply() {
    float big = Float.MAX_VALUE;
    assertEquals(92.25F, Calculator.multiply(12.3F, 7.5F));
    assertThrows(IllegalArgumentException.class, () -> {
      Calculator.add(big * 2, big * 2);
    });
  }
}