package com.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;  

public class Comparator1 {

	public static void main(String args[]){  

		ArrayList al=new ArrayList();  
		al.add(new Pojo(101,"Sharath",29));  
		al.add(new Pojo(106,"Raju",27));  
		al.add(new Pojo(105,"Santosh",28));
		al.add(new Pojo(108,"Yogesh",30));
		System.out.println("Sorting by Name");  

		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			Pojo st=(Pojo)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

		System.out.println("\nSorting by age");  

		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
			Pojo st=(Pojo)itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}   

}
