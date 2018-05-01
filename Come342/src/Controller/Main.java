package Controller;

public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Caddebostan Pupa","İstanbul/Kadıköy","pupa@gmail.com","İlkay Sever","ayberkkoklen@gmail.com",1);
		
		
		System.out.println("Şirket Adı: "+c1.getCompanyName());
		System.out.println("Şirket Adredsi: "+c1.getCompanyAddress());
		System.out.println("Şirket Maili: "+c1.getCompanyEmail());
		System.out.println("Müşteri Temsilcisi: "+c1.getContactName());
		System.out.println("İletişim Maili: "+c1.getContactEmail());
		
				
		
		c1.getClientCampaigns();
		c1.addNewCampaign();
		
		StaffMember s1 = new StaffMember(1,"Berkan Şevli","1 Ocak 2009","ayberkkoklen@gmail.com");
		
		s1.getStaffDetails();
		s1.assignStaffContact();
			
	}
		
}