public class RealNumberTester
{
  public static void main(String[] args)
  {
    RealNumber a = new RealNumber(40.0001);
    RealNumber b = new RealNumber(40.0002);
    RealNumber c = new RealNumber(41.0001);
    System.out.println(a.equals(b) + " should be true");
    System.out.println(b.equals(a) + " should be true");
    System.out.println(a.equals(c) + " should be false");
  }
}
