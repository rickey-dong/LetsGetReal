public class RealNumber
{
  private double value;
  public RealNumber(double v)
  {
    value = v;
  }
  public double getValue()
  {
    return value;
  }
  public String toString()
  {
    return "" + getValue();
  }
  public boolean equals(RealNumber other)
  {
    if (value == 0.0)
    {
      return (other.getValue() == 0.0);
    }
    else
    {
      return ((Math.abs(value - other.getValue()) / value) < 0.00001);
    }
  }
  public RealNumber add(RealNumber other)
  {
    double sum = value + other.getValue();
    RealNumber result = new RealNumber(sum);
    return result;
  }
  public RealNumber multiply(RealNumber other)
  {
    double product = value * other.getValue();
    RealNumber result = new RealNumber(product);
    return result;
  }
}
