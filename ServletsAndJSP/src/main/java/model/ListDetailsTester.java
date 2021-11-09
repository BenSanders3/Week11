package model;
import java.time.LocalDate;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.Shopper;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
public class ListDetailsTester {
	public static void main(String[] args) {
		Shopper cameron = new Shopper("Cameron");
		
		ShopperHelper sh = new ShopperHelper();
		
		sh.insertShopper(cameron);
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);
		
		ldh.insertNewListDetails(cameronList);
		
		List<ListDetails> allLists = ldh.getLists();
		
		for (ListDetails a : allLists) {
			System.out.println(a.toString());
		}
	}
}
