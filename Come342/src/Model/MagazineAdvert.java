package Model;
import java.util.ArrayList;

public class MagazineAdvert extends Advert {

	public MagazineAdvert(String advertTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(targetCompletionDate, targetCompletionDate, actualAdvertCost, actualAdvertCost);
		
		ArrayList <String> magazineAdvert = new ArrayList <String> ();	
		magazineAdvert.add("1 Mayıs 2018 ve 10 Mayıs 2018 tarihleri arasında Macbook Pro alana Adobe Programları %20 indirimli...");
		
		
		System.out.println (magazineAdvert.get(0));
		
		
	}

	public void Advert() {
		// TODO Auto-generated method stub
		
	}

}