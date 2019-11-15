package encapsulation;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Cal c=new Cal();
	int k=1;
	System.out.println("Enter Price of a ticket");
	c.setPrice(s.nextInt());
	System.out.println("Enter number of a Persons");
	c.setNumber(s.nextInt());
	int a=c.getNumber();
	do
	{
	System.out.println("Enter the details");	
	System.out.println("Name :");
	c.setName(s.next());
	System.out.println("Gender");
	c.setGender(s.next());
	System.out.println("Age :");
	c.setAge(s.nextInt());
	a--;	
	}while(a>0);
	c.ticket(c.getPrice(),c.getNumber());
	while(k<=c.getNumber())
	{
	double total=c.ticket1(c.getAge(),c.getGender(),c.getPrice(),c.getNumber());
	if(k==c.getNumber())
	{
		System.out.println("Total amount :"+total);
	    break;
	}
	k++;	
		
		
	}}
		 
	}
	
  class Cal
  {
	public int getP() {
		return p;
	}
	public double ticket1(int age2, String gender2, int price2, int number2) {
		if(age<16)
		{
			total=(double)sum+(Price-(Price*.50));
		    sum=total;
		    return total;

		    
		}
		else if(age>64)
		{
			total=(double)sum+(Price-(Price*.25));
		    sum=total;	
		    return total;

		}
		else if(gender.equals("F")&&age>16)
		{
			total=(double)sum+(Price-(Price*.10));
		    sum=total;	
		    return total;
		}
		return 0;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	int Price;
	int Number;
	String name;
	String gender;
	int age;
	int p;int i=1,j=0;
	double total=0,sum=0;
	public String getGender() {
		return gender;
	}
	public void ticket(int price2, int number2) {
		System.out.println("Ticket Details are...");
		System.out.println("No of Passengers "+Number);
		System.out.println("Price of a ticket "+Price);
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
  }
