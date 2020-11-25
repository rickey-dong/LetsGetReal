public abstract class Number
{
  public abstract double getValue();
  public boolean equals(Number other)
  {
    if (getValue() == 0.0)
    {
      return (other.getValue() == 0.0);
    }
    else
    {
      return ((Math.abs(getValue() - other.getValue()) / getValue()) < 0.00001);
    }
  }
}
