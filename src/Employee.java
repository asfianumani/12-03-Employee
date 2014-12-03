// placeholder for your Employee class
public class Employee
{
  String name;
  double hourlyWage;
  int hoursWorked;
  public Employee(String name1, double wage, int hours)
  {
    name=name1;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public String getName()
  {
    return name;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hourlyWage*hoursWorked;
  }
  public double getYearlySalary()
  {
    return getWeeklySalary()*52;
  }
  public String toString()
  {
    return "name: "+name+" wage: $"+hourlyWage+" hours: "+hoursWorked;
  }
  public void setName(String newName)
  {
    name=newName;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise()
  {
    hourlyWage+=1;
  }
}
    
