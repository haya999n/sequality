package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int getIndividualFee(int age) {
    int fee = 0;

    if (age <= 12) {
      fee = 1000;
    } else {
      fee = 2000;
    }

    return fee;
  }

  public int getTotalFee(int age, int groupSize) {
    int total = getIndividualFee(age) * groupSize;

    if (groupSize >= 10) {
      total = (int) (total * 0.9);
    }

    return total;
  }
}
