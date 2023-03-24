package org.calculator;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    float big = Float.MAX_VALUE;
    System.out.println(Calculator.divide(1, big));
  }
}