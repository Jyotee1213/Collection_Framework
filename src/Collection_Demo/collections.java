package Collection_Demo;

import java.util.ArrayList;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();				//ArratList
		al.add(100);
		al.add("Jyotee");
		al.add(200);
		System.out.println(al.add("aaa"));    //add method also returs boolean value
		System.out.println(al);
		
		System.out.println(al.contains(400)); //here if it contains 400 in array list it returns true
	                                          //if it doesnot contain in arrat list it returns false
		                                     
		System.out.println(al.isEmpty());  //it shows false when arraylist is not empty
											//It shows true when arraylist is empty
		
		System.out.println(al.size());    //it shows you size of arraylist which is 4 here//
		
		System.out.println(al.remove(0));   //remove according index value
		System.out.println(al);
	
		System.out.println(al.removeAll(al)); //it removes all values in arrayList
		System.out.println(al);
		
		al.clear();     //it shows empty array[]
		
//		ArrayList al2=new ArrayList();
//		al2.add("a");
//		al2.add("b");
//		al2.add("c");
//		System.out.println(al2);
//		
//		al.addAll(al2);
//		System.out.println(al);
//		
	
		
		
		
	}

}
