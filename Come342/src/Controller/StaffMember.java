package Controller;
import java.util.ArrayList;
public class StaffMember {
	
	public int StaffNo=1;
	public String StaffName;
	public String StartDate;
	public String EmailAddress;
	
	 public void getStaffDetails(){
			
			System.out.println("Çalışan Numarası = " + StaffNo);
			System.out.println("Çalışan Adı = " + StaffName);
			System.out.println("İşe Başlama Tarihi = " + StartDate);
			System.out.println("Çalışanın Email Adresi = " + EmailAddress);
		}
		
		public void assignStaffContact() {
			
			ArrayList <String> staffContact = new ArrayList <String> ();	
			staffContact.add("İlkay Sever 5346785454");
			staffContact.add("Berkan Şevli 5437659876");
			staffContact.add("Ecrin Ayberk Köklen 5437659876");
			
			System.out.println (staffContact.get(0));
			System.out.println (staffContact.get(1));
			System.out.println (staffContact.get(2));
					
		}
		public StaffMember(int alinanStaffNo,String alinanStaffName,String alinanStartDate,String alinanEmailAddress) {
			
			setStaffNo(alinanStaffNo);
			setStaffName(alinanStaffName);
			setStartDate(alinanStartDate);
			setEmailAddress(alinanEmailAddress);
		}
	
	public int getStaffNo() {
		return StaffNo;
	}

	public void setStaffNo(int staffNo) {
		StaffNo = staffNo;
	}

	public String getStaffName() {
		return StaffName;
	}

	public void setStaffName(String staffName) {
		StaffName = staffName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}



	public static void main(String[] args) {

	}

}