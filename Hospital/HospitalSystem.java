package Hospital;
import java.util.*;

public class HospitalSystem {
	ArrayList<Patient> Patients = new ArrayList<Patient>();
	private static HospitalSystem hospitalSystem;
	private HospitalSystem()
	{
		
	}
	public static HospitalSystem getInstance()
	{
		HospitalSystem hospitalSystem = new HospitalSystem();
		return hospitalSystem;
		
	}
	public int addPatient(String firstName, String lastName)
	{
		Patient patient = new Patient(firstName,lastName);
		Patients.add(patient);
		int id = Patients.indexOf(patient);
		return id;
	}
	public Patient getRecord(int Id)
	{
			return Patients.get(Id);
			
	}
	public void addAllergy(int id, String allergy)
	{
		Patient patient = getRecord(id);
		patient.Allergies.add(allergy);
	}
	public String getAllPatientsData()
	{
		String data="";
		int num=0;
		while(Patients.isEmpty() !=true)
		{
			
			data = data + Patients.get(num).toString();
			num++;
		}
		return data;
	}
	
}
