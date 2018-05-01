package Model;

import java.util.ArrayList;

public class NewspaperAdvert extends Advert {

	public NewspaperAdvert(String advertTitle, String targetCompletionDate, double estimatedAdvertCost,
			double actualAdvertCost) {
		super(targetCompletionDate, targetCompletionDate, actualAdvertCost, actualAdvertCost);
		
		ArrayList <String> newspaperAdvert = new ArrayList <String> ();	
		newspaperAdvert.add("BlackFriyday de bütün Ürünlerde %30 İndirim Kazandınız...");
		
		
		System.out.println (newspaperAdvert.get(0));
		
	}

	public void Advert() {
		
	}

}