public class NumberTester
{
  public static void main(String[] args)
  {
    RationalNumber frac1 = new RationalNumber(3,5);
    RationalNumber frac2 = new RationalNumber(3,10);
    RationalNumber frac3 = new RationalNumber(3,5);
    System.out.println(frac1.compareTo(frac2) + " should be 1");
    System.out.println(frac1.compareTo(frac3) + " should be 0");
    System.out.println(frac2.compareTo(frac1) + " should be -1");

    RealNumber float1 = new RealNumber(3.0055);
    RealNumber float2 = new RealNumber(6.055);
    RealNumber float3 = new RealNumber(3.00551);
    System.out.println(float1.compareTo(float2) + " should be -1");
    System.out.println(float1.compareTo(float3) + " should be 0");
    System.out.println(float2.compareTo(float1) + " should be 1");
  }
}
