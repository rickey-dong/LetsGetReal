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
  public int compareTo(Number other)
  {
    if (this.equals(other))
    {
      return 0;
    }
    else if (getValue() < other.getValue())
    {
      return -1;
    }
    else
    {
      return 1;
    }
  }
}
