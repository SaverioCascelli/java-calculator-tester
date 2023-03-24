package org.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  public static float add(float a, float b) throws IllegalArgumentException {
    BigDecimal bigA = new BigDecimal(String.valueOf(a));
    BigDecimal bigB = new BigDecimal(String.valueOf(b));
    float total = bigA.add(bigB).floatValue();
    if (Float.isInfinite(total)) {
      throw new IllegalArgumentException("Result too big for a Float");
    }
    return bigA.add(bigB).floatValue();
  }
  
  public static float subtract(float a, float b) throws IllegalArgumentException {
    BigDecimal bigA = new BigDecimal(String.valueOf(a));
    BigDecimal bigB = new BigDecimal(String.valueOf(b));
    float total = bigA.subtract(bigB).floatValue();
    System.out.println(total);
    if (Float.isInfinite(total)) {
      throw new IllegalArgumentException("Result too big for a Float");
    }
    return total;
  }
  
  public static float divide(float a, float b) throws ArithmeticException, IllegalArgumentException {
    if (b == 0) {
      throw new ArithmeticException("Can't divide by 0");
    }
    BigDecimal bigA = new BigDecimal(String.valueOf(a));
    BigDecimal bigB = new BigDecimal(String.valueOf(b));
    float total = bigA.divide(bigB).floatValue();
    if (Float.isInfinite(total)) {
      throw new IllegalArgumentException("Result too big for a Float");
    }
    return total;
  }
  
  public static float multiply(float a, float b) throws IllegalArgumentException {
    BigDecimal bigA = new BigDecimal(String.valueOf(a));
    BigDecimal bigB = new BigDecimal(String.valueOf(b));
    float total = bigA.multiply(bigB).floatValue();
    if (Float.isInfinite(total)) {
      throw new IllegalArgumentException("Result too big for a Float");
    }
    return total;
  }
}
