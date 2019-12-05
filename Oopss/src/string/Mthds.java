package string;

public class Mthds {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("Hello");
        a.append("Hai");//add values
       a.insert(2,"HI");//insert at position 2
        a.replace(2, 4, "Hai");//replace 2 to 4 by hai
        a.deleteCharAt(4);//delete char at 4
       a.delete(2,4);//delete characters 2 to 4
        System.out.println(a);
        a.reverse();
        System.out.println(a);
	}

}
