package week2;
/**
 * @author Mushka Stone
 * Using JCF Map :

2. Given 5 shoe manufactures (any of your favorites), please create a mapping (using JCF Map) 
to both store and print out your mappings. 

Key   value : Shoe name  ---->  Shoe Manufacturer 

Each of the 5 shoe manufacturers should have 2 different shoe styles entered into the Map.  

Please print all shoes out according to the key (it makes sense to sort upon value, however, 
it is easier to sort according to key - again - this should be fast if you know your JCF and 
your have chosen the correct permutation of Map).  

Please upload to Git and include the URL within this assignment 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JCFmap {
	public static void main(String[]args) {
		
		//First create a new hashmap
		Map<String, String> Shoes = new HashMap<>();
		
		//Lets add all our shoes and manu's to the hashmap
		Shoes.put("Air Max 90 AMD Shoes", "Nike");
		Shoes.put("Blazer Mid '77 Shoes", "Nike");
		Shoes.put("Renno Sneakers", "Fila");
		Shoes.put("Electrove 2 Sneakers", "Fila");
		Shoes.put("Gazelle Sneakers", "Adidas");
		Shoes.put("Stan Smith Sneakers","Adidas");
		Shoes.put("Yaro Perla Block Heel Sandal", "Sam Edelman");
		Shoes.put("Yaro Feather Heel Sandal", "Sam Edelman");
		Shoes.put("Sameera Black Leather", "Steve Madden");
		Shoes.put("Allison Brown Leather", "Steve Madden");
		
		//Lets sort the map according to the values
		List<Entry<String, String>> sorted = new ArrayList(Shoes.entrySet());
		sorted.sort(Entry.comparingByValue());
		
		//Lets print out the map according to keys
		sorted.forEach(System.out :: println);
		
	}
}

