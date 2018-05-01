package Helper;

import java.util.ArrayList;

import Controller.StaffMember;

public class CreativeStaff extends StaffMember {

	public CreativeStaff(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super(staffNo, staffName, staffStartDate, staffEmailAddress);
		
	}
	
public void assignStaffContact() {
		
		ArrayList <String> staffContact = new ArrayList <String> ();

		staffContact.add("Onur Dağdelen 05322249268");

		System.out.println (staffContact.get(0));

		
	}

	
	public void AddNewStaff() {
		
		ArrayList <String> staff = new ArrayList <String> ();	
		staff.add("8,ilkay sever ,23.03.2018,ilkaysever92@gmail.com");
		
		System.out.println ("İşe Alınan Tasarımcı =  " + staff.get(0));
		
	}


	public void StaffMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void type() {
		// TODO Auto-generated method stub
		
	}	
}
