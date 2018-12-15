package com.map1;

import java.util.HashMap;
import java.util.Map;

public class MapEx {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Pojo1> map=new HashMap<Integer,Pojo1>();    
    //Creating Books    
    Pojo1 b1=new Pojo1(101,"Sharathkumar","Hyd","Associate engineer",30000);    
    Pojo1 b2=new Pojo1(102,"Yogesh","Nirmal","Agriculture",15000);    
    Pojo1 b3=new Pojo1(103,"Anji","Hyd","Associate engineer",32500);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3); 
    //Traversing map  
    for(Map.Entry<Integer, Pojo1> entry:map.entrySet()){    
        int key=entry.getKey();  
        Pojo1 b=entry.getValue();   
        System.out.println(b.id+" "+b.name+" "+b.city+" "+b.designation+" "+b.salary);   
    }    
}    
}    