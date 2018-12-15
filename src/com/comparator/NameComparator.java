package com.comparator;
import java.util.*;  
	
	class NameComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
	Pojo s1=(Pojo)o1;  
	Pojo s2=(Pojo)o2;  
	  
	return s1.name.compareTo(s2.name);  
	}    

}
