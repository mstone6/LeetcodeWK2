package week2;

/** @author Mushka Stone
Remove duplicates on a list : 

1.  Given a list that includes duplicates - of any data type - remove the duplicates

your code should demonstrate the list with duplicates, and with all duplicates removed 

Hint : This is a super easy assignment if you know your JCF 

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class removeDupes{
	public static void main(String[]args) {
		
		//First lets create a list
		List<Object> shabbosItems = new ArrayList<Object>();
		
		shabbosItems.add("Kiddush Cup");
		shabbosItems.add("Challah Board");
		shabbosItems.add("2 Silver Candlesticks");
		shabbosItems.add("Salt Shaker");
		shabbosItems.add("Challah Cover");
		shabbosItems.add("Challah Knife");
		shabbosItems.add("Salt Shaker");
		shabbosItems.add("Kiddush Cup");
		shabbosItems.add("Cholent Pot");
		shabbosItems.add("Tzedaka Box");
		
		//Let's display the original List
		System.out.println("The Original List: " + shabbosItems);
		
		//Let's Create a Hash set to store the items that were iterated through
		HashSet<Object> itered = new HashSet<Object>();

		//Now lets get an iterator for Shabbos Items
		ListIterator<Object> listIterator = shabbosItems.listIterator();
		
		//Lets iterate through the list using a loop
		while(listIterator.hasNext()) {
			Object item = listIterator.next();
			
			//Now let's check if that element is already on the list.
			if(itered.contains(item)) {
				//Then lets remove the item.
				listIterator.remove();
			}else {
				itered.add(item);
			}
		}

		System.out.println("The Modified List: " + shabbosItems);


	}


}







 

