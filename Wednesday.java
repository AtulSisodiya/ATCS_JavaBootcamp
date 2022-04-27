
public class Person{
 int age;
  String name;

  public void setAge(int age)
  {
    this.age = age;
  }
  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  void Display()
  {
    System.out.println(getName());
    System.out.println(getAge());
  }
  
  
}

class politician extends Person
  {
    double salary;

    public void setSalary(double salary )
    {
      this.salary = salary;
    }
    public double getSalary()
    {
      return salary;
    }
    void Display()
  {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(getSalary());
    
  }
  }

class Sportsman extends Person
  {
    double salary;

    public void setSalary(double salary )
    {
      this.salary = salary;
    }
    public double getSalary()
    {
      return salary;
    }
    void Display()
  {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(getSalary());
    
  }

  }

class Main{

  public static void main(String[] args)
  {
    politician ob = new politician();

    ob.setName("Rakesh");
    ob.setAge(34);
    ob.setSalary(35000);
    ob.Display();

   Sportsman obj = new Sportsman();

    obj.setName("Virat");
    obj.setAge(34);
    obj.setSalary(12000000);
    obj.Display();
  }
  
  }