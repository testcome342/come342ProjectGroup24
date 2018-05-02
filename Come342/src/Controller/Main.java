package Controller;

import Helper.AdministrativeStaff;
import Helper.CreativeStaff;
import Model.Advert;
import Model.MagazineAdvert;
import Model.NewspaperAdvert;

public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Caddebostan Pupa","İstanbul/Kadıköy","pupa@gmail.com","İlkay Sever","ayberkkoklen@gmail.com",18);
		
		
		System.out.println("Şirket Adı = "+c1.getCompanyName());
		System.out.println("Şirket Adredsi = "+c1.getCompanyAddress());
		System.out.println("Şirket Maili = "+c1.getCompanyEmail());
		System.out.println("Müşteri Temsilcisi = "+c1.getContactName());
		System.out.println("İletişim Maili= "+c1.getContactEmail());
		
		c1.getClientCampaigns();
		c1.addNewCampaign();
				
		
		StaffMember s1 = new AdministrativeStaff(1,"","","");
		((AdministrativeStaff) s1).StaffMember();
		StaffMember s2 = new CreativeStaff(2,"","","");
		((CreativeStaff) s2).AddNewStaff();
		StaffMember s3 = new CreativeStaff(3,",","","");
		((CreativeStaff)s3).assignStaffContact();
		s1.getStaffDetails();
		
		
		Advert a1 = new MagazineAdvert("", "", 1.0, 2.0);
		((MagazineAdvert) a1).Advert();
		Advert a2 = new NewspaperAdvert("", "", 1.0, 2.0);
		((NewspaperAdvert) a2).Advert();
		
		
		
		
		
	}
		
}