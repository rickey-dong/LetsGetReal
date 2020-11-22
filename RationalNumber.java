public class RationalNumber extends RealNumber
{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno)
  {
    super(0.0);
    if (deno == 0)
    {
      numerator = 0;
      denominator = 1;
    }
    else if (deno < 0)
    {
      numerator = nume * -1;
      denominator = deno * -1;
    }
    else
    {
      numerator = nume;
      denominator = deno;
    }
  }
  public double getValue()
  {
    return (double) numerator / denominator;
  }
  public int getNumerator()
  {
    return numerator;
  }
  public int getDenominator()
  {
    return denominator;
  }
  public RationalNumber reciprocal()
  {
    int flippedNumer = denominator;
    int flippedDenom = numerator;
    RationalNumber flipped = new RationalNumber(flippedNumer, flippedDenom);
    return flipped;
  }
  public boolean equals(RationalNumber other)
  {
    return ( numerator == other.getNumerator() && denominator == other.getDenominator() );
  }
  public String toString()
  {
    return ("" + numerator + "/" + denominator);
  }
  private static int gcd(int a, int b)
  {
    int factor = 1;
    int minimum = 0;
    if (a < b)
    {
      minimum = a;
    }
    else
    {
      minimum = b;
    }
    for (int i = 2; i <= minimum; i++)
    {
      if ( (a % i == 0) && (b % i == 0) )
      {
        factor = i;
      }
    }
    return factor;
  }
}
