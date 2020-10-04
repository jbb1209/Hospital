package Hospital;
import java.util.*;

public class  Patient {
	int id=0;
	String firstName="";
	String lastName="";
	ArrayList<String> Allergies= new ArrayList<String>();
	
	 Patient(String FirstName, String LastName)
	{
		
		this.firstName=FirstName;
		this.lastName=LastName;
		
		
	}
	 public String toString()
	 {   int num=0;
		 String allergies="";
		 if(Allergies.isEmpty()==true)
		 {
			 return null;
		 }
		 else
		 {
		 while(Allergies.isEmpty() != true)
		 {
			 allergies = allergies+" , "+Allergies.get(num);
			 num++;
		 }
		 
		 return "Patient "+id+": "+" "+firstName+" "+lastName+"\n   Allergies:"+ allergies;
	 }
	 }
}
