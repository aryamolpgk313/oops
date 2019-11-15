package encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Cust c=new Cust();
		System.out.println("Registration\n");
		System.out.println("Enter a number");
		c.setNumber(s.nextInt());
		System.out.println("Enter your name");
		c.setName(s.next());
		System.out.println("Enter your address");
		c.setAddress(s.next());
		System.out.println("Contact number");
		c.setContactnumber(s.next());
		System.out.println("Email id");
        c.setEmail(s.next());
        System.out.println("Enter proof type");
        c.setProoftype(s.next());
        System.out.println("Enter proof id");
        c.setProofid(s.next());
		
		}
	}

class Cust{
	int number;
	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		
		if(name.matches("^[a-zA-Z]*$"))
		{
			this.name = name;
			return true;
		}
	    else 
	    {
	    	System.out.println("Invalid name");
			return false;
		}
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		if(address.matches("^[a-zA-Z0-9]*$"))
		{
			this.address = address;
			return true;
		}
	    else 
	    {
	    	System.out.println("Invalid address");
			return false;
		}
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public boolean setContactnumber(String contactnumber) {
		if(contactnumber.matches("^[0-9]*$"))
		{
			this.contactnumber = contactnumber;
			return true;
		}
	    else 
	    {
	    	System.out.println("Invalid number");
			return false;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if(email.contains("@"))
		{
			this.email = email;
			return true;
		}
	    else 
	    {
	    	System.out.println("Invalid email");
			return false;
		}
		
	}
	public String getProoftype() {
		return prooftype;
	}
	public boolean setProoftype(String prooftype) {
		if(prooftype.matches("^[a-zA-Z]*$"))
		    {
				this.prooftype = prooftype;
				return true;
			}
		    else 
		    {
		    	System.out.println("Invalid proof");
				return false;
		    }
	}
	public String getProofid() {
		return proofid;
	}
	public boolean setProofid(String proofid) {
		if(proofid.matches("^[a-zA-Z0-9]*$"))
	    {
			this.proofid =proofid;
			return true;
		}
	    else 
	    {
	    	System.out.println("Invalid proof");
			return false;
	    }
	}
	void display()
	{
		System.out.println("Your Details:");
		System.out.println(getNumber());
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println(getContactnumber());
		System.out.println(getEmail());
		System.out.println(getProoftype());
		System.out.println(getProofid());
		System.out.println("Your id is "+getNumber());
	}
}
