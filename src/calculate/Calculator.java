package calculate;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Calculator {


  /**
   * Sum of two int  numbers
   */
  public int suma(int a, int b) {
    return a + b;

  }

  /**
   * Sum of two double numbers
   */

  public double suma(double a, double b) {
    return a + b;

  }

  /**
   * Sum of two strings
   */
  public String suma(String a, String b) {
    BigDecimal s= new BigDecimal(a);
    BigDecimal t= new BigDecimal(b);
    s= s.add(t);
    return s.toString();

  }

  /**
   * Sum of two BigInteger   numbers
   */
  public BigInteger suma(BigInteger a, BigInteger b) {
    return a.add(b);

  }

  /**
   * Sum of two BigDecimal  numbers
   */

  public BigDecimal suma(BigDecimal a, BigDecimal b) {
    return a.add(b);

  }


}

