package calculate;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {
  public static void main(String[] args) {
    Calculator arr = new Calculator();
    arr.suma(2, 3);

    BigInteger bigInt = arr.suma(BigInteger.valueOf(434344567), BigInteger.valueOf(1254879587));

    BigDecimal bigDec = arr.suma(BigDecimal.valueOf(4343.44567), BigDecimal.valueOf(125487.9587));

    System.out.println(" ");
    System.out.println("Sum of integer: " + arr.suma(45, 56));
    System.out.println(" ");
    System.out.println("Sum of double: " + arr.suma(2.61545466, 3.4));
    System.out.println(" ");
    System.out.println("Sum of String: " + arr.suma("15", "2"));
    System.out.println(" ");
    System.out.println("Sum of BigIntegers is: " + bigInt);
    System.out.println(" ");
    System.out.println("Sum of BigDecimal is: " + bigDec);


  }
}
