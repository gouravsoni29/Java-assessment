package _30sep;
import java.util.*;


public class ToothpasteBrand {
	public static void main(String[] args) 
	{
		// ToothpasteType ob;    	
		Scanner sc = new Scanner(System.in);

		Map<Integer,ToothpasteType1> mapValue = new HashMap<Integer,ToothpasteType1>();

		System.out.println("Enter the Number of members: ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) 
		{
			mapValue.put(i, new ToothpasteType1());
		}	        

		for(Map.Entry<Integer, ToothpasteType1> entry:mapValue.entrySet()){    
			int key=entry.getKey();  
			ToothpasteType1 b=entry.getValue();  
			System.out.println(key+" Data:");  
			System.out.println("Name: " + b.name + "\nAge: " + b.age +"\nMember Type: " + b.memberType+"\nToothpaste Type: " + b.toothpasteTypes);    
		} 

		System.out.println(ToothpasteType1.countPastes());
		sc.close();
	}
}
