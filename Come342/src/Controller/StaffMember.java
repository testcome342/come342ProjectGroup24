package Controller;
public abstract  class  StaffMember {
	
	private int StaffNo;
	private String StaffName,StaffStartDate,StaffEmailAddress;
	
	
	public StaffMember(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super();
		StaffNo = 3;
		StaffName = "Ayberk Köklen";
		StaffStartDate = "12.08.2008";
		StaffEmailAddress = "ayberkkoklen@gmail.com";
	}
	
	
	public abstract void type();
	
	
	public void getStaffDetails() {
		
		System.out.println("Çalışanımızın numarası =  " + StaffNo);

		System.out.println("Çalışanımızın İsmi = " + StaffName);

		System.out.println("Çalışanımızın İşe Başlama Tarihi = " + StaffStartDate);

		System.out.println("Çalışanımızın Email Adresi = " + StaffEmailAddress);
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
	public String getStaffStartDate() {
		return StaffStartDate;
	}
	public void setStaffStartDate(String staffStartDate) {
		StaffStartDate = staffStartDate;
	}
	public String getStaffEmailAddress() {
		return StaffEmailAddress;
	}
	public void setStaffEmailAddress(String staffEmailAddress) {
		StaffEmailAddress = staffEmailAddress;
	}	
}