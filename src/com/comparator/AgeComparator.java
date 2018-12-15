package com.comparator;

import java.util.Comparator;  
class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Pojo s1=(Pojo)o1;  
Pojo s2=(Pojo)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  