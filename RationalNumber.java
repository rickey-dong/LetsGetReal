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
    reduce();
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
    if (denominator != 1 && numerator != 0)
    {
      return ("" + numerator + "/" + denominator);
    }
    else
    {
      return ("" + numerator);
    }
  }
  private static int gcd(int a, int b)
  {
    int factor = 1;
    int minimum = 0;
    if (Math.abs(a) < Math.abs(b))
    {
      minimum = Math.abs(a);
    }
    else
    {
      minimum = Math.abs(b);
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
  private void reduce()
  {
    int gcf = gcd(numerator, denominator);
    numerator = numerator / gcf;
    denominator = denominator / gcf;
  }
  public RationalNumber multiply(RationalNumber other)
  {
    int productNumer = numerator * other.getNumerator();
    int productDenom = denominator * other.getDenominator();
    RationalNumber product = new RationalNumber(productNumer, productDenom);
    return product;
  }
  public RationalNumber divide(RationalNumber other)
  {
    int productNumer = numerator * other.reciprocal().getNumerator();
    int productDenom = denominator * other.reciprocal().getDenominator();
    RationalNumber quotient = new RationalNumber(productNumer, productDenom);
    return quotient;
  }
  public RationalNumber add(RationalNumber other)
  {
    int LCD = denominator * other.getDenominator();
    int firstFractionScale = LCD / denominator;
    int secondFractionScale = LCD / other.getDenominator();
    int newFirstNumer = numerator * firstFractionScale;
    int newSecondNumer = other.getNumerator() * secondFractionScale;
    RationalNumber sum = new RationalNumber(newFirstNumer + newSecondNumer, LCD);
    return sum;
  }
  public RationalNumber subtract(RationalNumber other)
  {
    int LCD = denominator * other.getDenominator();
    int firstFractionScale = LCD / denominator;
    int secondFractionScale = LCD / other.getDenominator();
    int newFirstNumer = numerator * firstFractionScale;
    int newSecondNumer = other.getNumerator() * secondFractionScale;
    RationalNumber difference = new RationalNumber(newFirstNumer - newSecondNumer, LCD);
    return difference;
  }
}
