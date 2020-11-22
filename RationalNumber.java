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
}
