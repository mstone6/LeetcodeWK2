package week2;

/**
 * @author Mushka Stone
*Using Iterable: 

Design a class that encapsulates (contains ) an array 
(of any data type of your choice) which implements the interface iterable 
//example : 
public class MyArray implements Iterable<Integer>

{

     private Integer[] array;

      //etc 

}

Use a for loop to print out all elements in your array.  

Please fill your array with 10 elements. 
*/

import java.util.Iterator;
import java.lang.Iterable;


public class UsingIterable{
	//First lets create an array
	public static String[] arrayShirts = {"Sky Blue Shirt", "Green Shirt", "Yellow Shirt", "Purple Shirt", "Orange Shirt", 
			"Pink Shirt", "Red Shirt", "Hunter Green Shirt", "Polka Dot Shirt", "Midnight Blue Shirt"};

	public static void main(String[]args) {
	
	usingIterable<String> wrap = new usingIterable(arrayShirts);
	
	for(String arrayShirt : wrap) {
		System.out.println(arrayShirt);
	}
	
}
	public static class usingIterable<S> implements Iterable<S>{
		
		private S[]arrayShirts;
		
		public usingIterable(S[]arrayShirts) {
			//This is a constructor
			this.arrayShirts = arrayShirts;
		}
		
		@Override
		public Iterator<S> iterator() {
			// 
			return new ArrayIterator();
		}

		private class ArrayIterator implements Iterator<S> {
			
			private int index;
			
			public ArrayIterator() {
				this.index = 0;

		}
		
		
		@Override
		public boolean hasNext() {
			//This will return as true if the index is less then the array
			return this.index < usingIterable.this.arrayShirts.length;
		}
		
		@Override
		public S next() {
			// This will return the elements of the array at the index and increment it.
			return usingIterable.this.arrayShirts[this.index++];
		}
		
		@Override
		public void remove() {
			//Cannot remove from array, throw exception
			throw new UnsupportedOperationException("You cannot remove from an array.");
		}
		}
	}
}

