package Helper;

import java.util.ArrayList;

import Controller.StaffMember;

public class CreativeStaff extends StaffMember {

	public CreativeStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super(staffNo, staffName, staffStartDate, staffEmailAddress);
		
	}
	
public void assignStaffContact() {
		
		ArrayList <String> staffContact = new ArrayList <String> ();

		
		staffContact.add("Ayın elemanı Onur Dağdelen 05322249268");

		System.out.println (staffContact.get(0));

		
	}

	
	public void AddNewStaff() {
		
		ArrayList <String> staff = new ArrayList <String> ();	
		staff.add("Elenay Kemerkapulu");
		staff.add("23.03.2018");
		staff.add("elenay@gmail.com");
		
		System.out.println ("İşe Alınan Tasarımcı Adı =  " + staff.get(0));
		System.out.println ("İşe Başlama Tarihi =  " + staff.get(1));
		System.out.println ("Email Adresi =  " + staff.get(2));
		
	}


	public void StaffMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}	
}
