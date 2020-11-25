public class RealNumber extends Number
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
  public RealNumber divide(RealNumber other)
  {
    double quotient = value / other.getValue();
    RealNumber result = new RealNumber(quotient);
    return result;
  }
  public RealNumber subtract(RealNumber other)
  {
    double difference = value - other.getValue();
    RealNumber result = new RealNumber(difference);
    return result;
  }
}
