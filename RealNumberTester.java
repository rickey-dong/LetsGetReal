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

    System.out.println("============Rational Number Testing============");

    RationalNumber z = new RationalNumber(5,0);
    RationalNumber y = new RationalNumber(5,-2);
    RationalNumber x = new RationalNumber(5,2);
    RationalNumber w = new RationalNumber(-5,-2);

    RealNumber x1 = new RealNumber(2.5);

    System.out.println(z.getValue() + " should be 0.0");
    System.out.println(y.getValue() + " should be -2.5");
    System.out.println(x.getValue() + " should be 2.5");
    System.out.println(x1.equals(x) + " should be true");

    System.out.println(y.getNumerator() + " should be -5");
    System.out.println(x.getNumerator() + " should be 5");
    System.out.println(z.getNumerator() + " should be 0");

    System.out.println(y.getDenominator() + " should be 2");
    System.out.println(x.getDenominator() + " should be 2");
    System.out.println(z.getDenominator() + " should be 1");

    RationalNumber Z = z.reciprocal();
    RationalNumber Y = y.reciprocal();
    RationalNumber X = x.reciprocal();
    System.out.println(Z.getNumerator() + " should be 0");
    System.out.println(Z.getDenominator() + " should be 1");
    System.out.println(Y.getNumerator() + " should be -2");
    System.out.println(Y.getDenominator() + " should be 5");
    System.out.println(X.getNumerator() + " should be 2");
    System.out.println(X.getDenominator() + " should be 5");

    System.out.println(x.equals(y) + " should be false");
    System.out.println(Z.equals(z) + " should be true");

    System.out.println(x + " should be 5/2");
    System.out.println(y + " should be -5/2");
    System.out.println(z + " should be 0/1");
    System.out.println(X + " should be 2/5");
    System.out.println(Y + " should be -2/5");
    System.out.println(Z + " should be 0/1");
    System.out.println(w + " should be 5/2");

    //System.out.println(RationalNumber.gcd(10,15) + " should be 5");
    //System.out.println(RationalNumber.gcd(3,7) + " should be 1");
    //System.out.println(RationalNumber.gcd(24,12) + " should be 12");
    //System.out.println(RationalNumber.gcd(40,40) + " should be 40");
    RationalNumber h = new RationalNumber(5,10);
    RationalNumber j = new RationalNumber(-5,10);
    RationalNumber k = new RationalNumber(-5,-10);
    System.out.println(h + " should be 1/2");
    System.out.println(j + " should be -1/2");
    System.out.println(k + " should be 1/2");
    System.out.println(x + " should be 5/2");

    RationalNumber m = new RationalNumber(3,4);
    RationalNumber n = new RationalNumber(4,5);
    RationalNumber p = new RationalNumber(-3,2);

    System.out.println(m.multiply(n) + " should be 3/5");
    System.out.println(n.multiply(p) + " should be -6/5");
    System.out.println(m.multiply(p) + " should be -9/8");
  }
}
