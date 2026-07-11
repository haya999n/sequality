package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testIndividualFeeForTen() {
    Calculate calc = new Calculate();
    int expected = 1000;
    assertEquals(expected, calc.getIndividualFee(10));
  }

  @Test
  public void testIndividualFee_Age12orLess_Returns1000() {
    Calculate calc = new Calculate();
    int expected = 1000;
    assertEquals(expected, calc.getIndividualFee(12));
  }

  @Test
  public void testIndividualFee_Age13orMore_Returns2000() {
    Calculate calc = new Calculate();
    int expected = 2000;
    assertEquals(expected, calc.getIndividualFee(13));
  }

  @Test
  public void testTotalFee_GroupSizeLessThan10_ReturnsNormalFee() {
    Calculate calc = new Calculate();
    int expected = 2000;
    assertEquals(expected, calc.getTotalFee(13, 1));
  }

  @Test
  public void testTotalFee_GroupSize10orMore_ReturnsDiscountedFee() {
    Calculate calc = new Calculate();
    int expected = 18000;
    assertEquals(expected, calc.getTotalFee(13, 10));
  }
}
