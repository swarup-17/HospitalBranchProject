package hibernateProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("swarup");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Hospitals hospital = new Hospitals();
//		hospital.setId(1);
//		hospital.setName("Apollo");
//		hospital.setCeo("Dr. Sanjeev");
//		
//		Branches branch1 = new Branches();
//		branch1.setId(1);
//		branch1.setName("Apollo Deccan");
//		branch1.setManager("Mahesh");
//		
//		Branches branch2 = new Branches();
//		branch2.setId(2);
//		branch2.setName("Apollo Baner");
//		branch2.setManager("Suresh");
//		
//		Branches branch3 = new Branches();
//		branch3.setId(3);
//		branch3.setName("Apollo Wakad");
//		branch3.setManager("Dinesh");
//		
//		List<Branches> branches = new ArrayList<Branches>();
//		branches.add(branch1);
//		branches.add(branch2);
//		branches.add(branch3);
//		
//		hospital.setBranch(branches);
//		
//		Address address1 = new Address();
//		address1.setId(1);
//		address1.setLocation("Deccan");
//		address1.setLandmark("JM road");
//		address1.setPincode(413242);
//		
//		branch1.setAddres(address1);
//		
//		Address address2 = new Address();
//		address2.setId(2);
//		address2.setLocation("Baner");
//		address2.setLandmark("MG road");
//		address2.setPincode(412342);
//		
//		branch2.setAddres(address2);
//		
//		Address address3 = new Address();
//		address3.setId(3);
//		address3.setLocation("Wakad");
//		address3.setLandmark("Bhumkar chowk");
//		address3.setPincode(412242);
//		
//		branch3.setAddres(address3);
//		
//		Patients patient1 = new Patients();
//		patient1.setId(1);
//		patient1.setName("Pavan");
//		patient1.setAge(34);
//		patient1.setGender("Male");
//		patient1.setBloodgroup("O+");
//		
//		Patients patient2 = new Patients();
//		patient2.setId(2);
//		patient2.setName("Samir");
//		patient2.setAge(24);
//		patient2.setGender("Male");
//		patient2.setBloodgroup("A+");
//		
//		Patients patient3 = new Patients();
//		patient3.setId(3);
//		patient3.setName("Yash");
//		patient3.setAge(54);
//		patient3.setGender("Male");
//		patient3.setBloodgroup("B+");
//		
//		List<Patients> patients1 = new ArrayList<Patients>();
//		patients1.add(patient1);
//		patients1.add(patient2);
//		patients1.add(patient3);
//		
//		branch1.setPatient(patients1);
//		
//		Patients patient4 = new Patients();
//		patient4.setId(4);
//		patient4.setName("Raj");
//		patient4.setAge(21);
//		patient4.setGender("Male");
//		patient4.setBloodgroup("O-");
//		
//		Patients patient5 = new Patients();
//		patient5.setId(5);
//		patient5.setName("Pooja");
//		patient5.setAge(25);
//		patient5.setGender("Female");
//		patient5.setBloodgroup("B+");
//		
//		Patients patient6 = new Patients();
//		patient6.setId(6);
//		patient6.setName("Yashika");
//		patient6.setAge(32);
//		patient6.setGender("Female");
//		patient6.setBloodgroup("A-");
//		
//		List<Patients> patients2 = new ArrayList<Patients>();
//		patients2.add(patient4);
//		patients2.add(patient5);
//		patients2.add(patient6);
//		
//		branch2.setPatient(patients2);
//		
//		Patients patient7 = new Patients();
//		patient7.setId(7);
//		patient7.setName("Emilly");
//		patient7.setAge(12);
//		patient7.setGender("Female");
//		patient7.setBloodgroup("B+");
//		
//		Patients patient8 = new Patients();
//		patient8.setId(8);
//		patient8.setName("Alex");
//		patient8.setAge(27);
//		patient8.setGender("Male");
//		patient8.setBloodgroup("AB+");
//		
//		List<Patients> patients3 = new ArrayList<Patients>();
//		patients3.add(patient7);
//		patients3.add(patient8);
//		
//		branch3.setPatient(patients3);
//		
//		Diseases disease1 = new Diseases();
//		disease1.setId(1);
//		disease1.setDname("Swine flu");
//		disease1.setSymptoms("fever,cough,headache");
//		
//		Diseases disease2 = new Diseases();
//		disease2.setId(2);
//		disease2.setDname("Corona");
//		disease2.setSymptoms("fever,cough,sore throat");
//		
//		Diseases disease3 = new Diseases();
//		disease3.setId(3);
//		disease3.setDname("Chickenpox");
//		disease3.setSymptoms("rashes");
//		
//		List<Diseases> diseases1 = new ArrayList<Diseases>();
//		diseases1.add(disease1);
//		diseases1.add(disease2);
//		
//		List<Diseases> diseases2 = new ArrayList<Diseases>();
//		diseases2.add(disease2);
//		diseases2.add(disease3);
//		
//		List<Diseases> diseases3 = new ArrayList<Diseases>();
//		diseases3.add(disease1);
//		diseases3.add(disease3);
//		
//		patient1.setDisease(diseases1);
//		patient2.setDisease(diseases3);
//		patient3.setDisease(diseases2);
//		patient4.setDisease(diseases3);
//		patient5.setDisease(diseases2);
//		patient6.setDisease(diseases1);
//		patient7.setDisease(diseases3);
//		patient8.setDisease(diseases2);
//		
//		Encounter encounter1 = new Encounter();
//		encounter1.setId(1);
//		encounter1.setPname("Pavan");
//		encounter1.setLastin("21/12/2022");
//		encounter1.setLastout("02/01/2023");
//		
//		Encounter encounter2 = new Encounter();
//		encounter2.setId(2);
//		encounter2.setPname("Samir");
//		encounter2.setLastin("01/10/2022");
//		encounter2.setLastout("20/10/2022");
//		
//		Encounter encounter3 = new Encounter();
//		encounter3.setId(3);
//		encounter3.setPname("Yash");
//		encounter3.setLastin("11/03/2023");
//		encounter3.setLastout("30/03/2023");
//		
//		Encounter encounter4 = new Encounter();
//		encounter4.setId(4);
//		encounter4.setPname("Raj");
//		encounter4.setLastin("12/02/2023");
//		encounter4.setLastout("15/02/2023");
//		
//		Encounter encounter5 = new Encounter();
//		encounter5.setId(5);
//		encounter5.setPname("Pooja");
//		encounter5.setLastin("11/01/2023");
//		encounter5.setLastout("20/01/2023");
//		
//		Encounter encounter6 = new Encounter();
//		encounter6.setId(6);
//		encounter6.setPname("Yashika");
//		encounter6.setLastin("21/01/2023");
//		encounter6.setLastout("01/02/2023");
//		
//		Encounter encounter7 = new Encounter();
//		encounter7.setId(7);
//		encounter7.setPname("Emilly");
//		encounter7.setLastin("09/03/2023");
//		encounter7.setLastout("14/03/2023");
//		
//		Encounter encounter8 = new Encounter();
//		encounter8.setId(8);
//		encounter8.setPname("Alex");
//		encounter8.setLastin("05/04/2023");
//		encounter8.setLastout("13/04/2023");
//		
//		Encounter encounter9 = new Encounter();
//		encounter9.setId(9);
//		encounter9.setPname("Pavan");
//		encounter9.setLastin("21/01/2022");
//		encounter9.setLastout("02/02/2023");
//		
//		Encounter encounter10 = new Encounter();
//		encounter10.setId(10);
//		encounter10.setPname("Samir");
//		encounter10.setLastin("11/11/2022");
//		encounter10.setLastout("20/01/2023");
//		
//		Encounter encounter11 = new Encounter();
//		encounter11.setId(11);
//		encounter11.setPname("Raj");
//		encounter11.setLastin("02/03/2023");
//		encounter11.setLastout("05/03/2023");
//		
//		Encounter encounter12 = new Encounter();
//		encounter12.setId(12);
//		encounter12.setPname("Pooja");
//		encounter12.setLastin("23/02/2023");
//		encounter12.setLastout("02/03/2023");
//		
//		Encounter encounter13 = new Encounter();
//		encounter13.setId(13);
//		encounter13.setPname("Yashika");
//		encounter13.setLastin("13/03/2023");
//		encounter13.setLastout("27/03/2023");
//		
//		Encounter encounter14 = new Encounter();
//		encounter14.setId(14);
//		encounter14.setPname("Emilly");
//		encounter14.setLastin("30/03/2023");
//		encounter14.setLastout("12/04/2023");
//		
//		List<Encounter> encounters1 = new ArrayList<Encounter>();
//		encounters1.add(encounter1);
//		encounters1.add(encounter9);
//		
//		patient1.setEncounter(encounters1);
//		
//		List<Encounter> encounters2 = new ArrayList<Encounter>();
//		encounters2.add(encounter2);
//		encounters2.add(encounter10);
//		
//		patient2.setEncounter(encounters2);
//		
//		List<Encounter> encounters3 = new ArrayList<Encounter>();
//		encounters3.add(encounter3);
//		
//		patient3.setEncounter(encounters3);
//		
//		List<Encounter> encounters4 = new ArrayList<Encounter>();
//		encounters4.add(encounter4);
//		encounters4.add(encounter11);
//		
//		patient4.setEncounter(encounters4);
//		
//		List<Encounter> encounters5 = new ArrayList<Encounter>();
//		encounters5.add(encounter5);
//		encounters5.add(encounter12);
//		
//		patient5.setEncounter(encounters5);
//		
//		List<Encounter> encounters6 = new ArrayList<Encounter>();
//		encounters6.add(encounter6);
//		encounters6.add(encounter13);
//		
//		patient6.setEncounter(encounters6);
//		
//		List<Encounter> encounters7 = new ArrayList<Encounter>();
//		encounters7.add(encounter7);
//		encounters7.add(encounter14);
//		
//		patient7.setEncounter(encounters7);
//		
//		List<Encounter> encounters8 = new ArrayList<Encounter>();
//		encounters8.add(encounter8);
//		
//		patient8.setEncounter(encounters8);
//		
//		et.begin();
//		em.persist(hospital);
//		et.commit();
		
//		=========================================================================
		
//		Fetch Data
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose one option: ");
		System.out.println("1 : Get branches using hospital ID ");
		System.out.println("2 : Get branch details using branch ID ");
		System.out.println("3 : Get patients using branch ID ");
		System.out.println("4 : Get patients disease using patients ID ");
		System.out.println("5 : Get patients encounters using patients ID ");
		System.out.println("6 : Delete patient data using patients ID ");
		System.out.println("7 : Delete branch using branch ID ");
		
		switch(sc.nextInt())
		{
			case 1:
			{
				System.out.println("Enter hospital ID: ");
				Hospitals hospital = em.find(Hospitals.class, sc.nextInt());
				
				if(hospital!=null)
				{
					List<Branches> branches = hospital.getBranch();
						
					for (Branches b : branches)
					{
						System.out.println();
						System.out.println("Branch ID: "+b.getId());
						System.out.println("Branch Name: "+b.getName());
						System.out.println("Branch Manager: "+b.getManager());
					}
				}
				else
				{
					System.out.println("Entered ID is not present!!!");
				}
			}
			break;
		
			case 2:
			{
				System.out.println("Enter branch ID: ");
				Branches branch = em.find(Branches.class, sc.nextInt());
				
				if(branch!=null)
				{
					Address address = branch.getAddres();
					System.out.println();
					System.out.println("Branch ID: "+address.getId());
					System.out.println("Branch Location: "+address.getLocation());
					System.out.println("Branch Landmark: "+address.getLandmark());
					System.out.println("Branch Pincode: "+address.getPincode());
				}
				else 
				{
					System.out.println("Entered ID is not present!!!");
				}
			}
			break;
			
			case 3:
			{
				System.out.println("Enter branch ID:");
				Branches branch = em.find(Branches.class, sc.nextInt());
				
				if(branch!=null)
				{
					List<Patients> patient = branch.getPatient();
					
					for (Patients p : patient)
					{
						System.out.println();
						System.out.println("Patients ID: "+p.getId());
						System.out.println("Patients Name: "+p.getName());
						System.out.println("Patients Age: "+p.getAge());
						System.out.println("Patients Gender: "+p.getGender());
						System.out.println("Patients Bloodgroup: "+p.getBloodgroup());
					}
				}
				else 
				{
					System.out.println("Entered ID is not present!!!");
				}
			}
			break;
			
			case 4:
			{
				System.out.println("Enter patient ID:");
				Patients patient = em.find(Patients.class, sc.nextInt());
				
				if(patient!=null)
				{
					List<Diseases> disease = patient.getDisease();

					System.out.println("Patient Name: "+patient.getName());
					
					for (Diseases d : disease) 
					{
						System.out.println();
						System.out.println("Disease ID: "+d.getId());
						System.out.println("Disease Name: "+d.getDname());
						System.out.println("Disease Symptoms: "+d.getSymptoms());
					}
				}
				else 
				{
					System.out.println("Entered ID is not present!!!");
				}
			}
			break;
			
			case 5:
			{
				System.out.println("Enter patient ID:");
				Patients patient = em.find(Patients.class, sc.nextInt());
				
				if(patient!=null)
				{
					List<Encounter> encounter = patient.getEncounter();
					
					for (Encounter e : encounter) 
					{
						System.out.println();
						System.out.println("Encounter ID: "+e.getId());
						System.out.println("Patient Name: "+e.getPname());
						System.out.println("Last in date: "+e.getLastin());
						System.out.println("Last out date: "+e.getLastout());
					}
				}
				else 
				{
					System.out.println("Entered ID is not present!!!");
				}
			}
			break;
			
			case 6:
			{
				System.out.println("Enter patient ID:");
				Patients patient = em.find(Patients.class, sc.nextInt());
				
				if(patient!=null)
				{
					et.begin();
					em.remove(patient);
					et.commit();
				}
				else
				{
					System.out.println("Entered ID is not present!!");
				}
			}
			break;
			
			case 7:
			{
				System.out.println("Enter branch ID:");
				Branches branch = em.find(Branches.class, sc.nextInt());
				
				if(branch!=null)
				{
					et.begin();
					em.remove(branch);
					et.commit();
				}
				else
				{
					System.out.println("Entered ID is not present!!");
				}
			}
			break;
			
			default:
			{
				System.out.println("Invalid Input!!!");
			}
		}
	}
}
