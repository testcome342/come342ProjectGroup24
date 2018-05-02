package Controller;

import java.util.ArrayList;
public class Client {
		
	public String companyName,companyAddress,companyEmail;
	public String contactName,contactEmail;
	int id=1; 
	 
	 public void getClientCampaigns(){
			
			System.out.println(id + " Müşteri Numaranız ile 100 TL indirim kazandınız...");
		}
		
		public void addNewCampaign() {
			
			ArrayList <String> campaigns = new ArrayList <String> ();	
			campaigns.add("Sene sonuna kadar geçerli indiriminizi dilediğiniz zaman kullanabilirsiniz...");
			campaigns.add("Ayrıca 1 hafta içinde yapacağınız satın alma işlemlerinde % 25 indirim kazanabilirsiniz...");
			
			
			System.out.println (campaigns.get(0));
			System.out.println (campaigns.get(1));
			
					
		}
		public Client(String alinancompanyName,String alinancompanyAddress,String alinancompanyEmail,String alinancontactName,String alinancontactEmail,int alinanid) {
			
			setCompanyName(alinancompanyName);
			setCompanyAddress(alinancompanyAddress);
			setCompanyEmail(alinancompanyEmail);
			setContactName(alinancontactName);
			setContactEmail(alinancontactEmail);
			setId(alinanid);					
						
		}
	 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getCompanyAddress() {
			return companyAddress;
		}
		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}
		public String getCompanyEmail() {
			return companyEmail;
		}
		public void setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
		}
		public String getContactName() {
			return contactName;
		}
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}
		public String getContactEmail() {
			return contactEmail;
		}
		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}
	
}