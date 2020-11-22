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

    RealNumber d = a.add(b);
    RealNumber e = new RealNumber(80.0003);
    System.out.println(d + " should be around 80.0003");
    System.out.println(a.add(b) + " should be around 80.0003");
    System.out.println(b.add(c) + " should be around 81.0003");
    System.out.println(d.equals(e) + " should be true");

    System.out.println(a.multiply(b) + " should be around 1600.01200002");
    RealNumber f = new RealNumber(1600.01200002);
    System.out.println(a.multiply(b).equals(f) + " should be true");

    System.out.println(f.divide(e) + " should be around 20.000075");
    System.out.println(c.divide(a) + " should be around 1.0249999375");

    System.out.println(c.subtract(a) + " should be around 1.0000");
    System.out.println(f.subtract(e) + " should be around 1520.01170002");
  }
}
