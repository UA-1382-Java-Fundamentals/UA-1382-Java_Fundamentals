package com.softserve.academy.edu1.Hw11.hw2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonMap {
    Map<String,String > personMap=new TreeMap<>();
    public PersonMap() {
        personMap.put("Vlas", "Oleh");
        personMap.put("Aser", "Oleh");
        personMap.put("Best", "Pavlo");
        personMap.put("Vast", "Tory");
        personMap.put("Lert", "Petro");
        personMap.put("Brute", "Oleh");
        personMap.put("Fase", "Ivan");
    }
    public void findSameName(String name){
        int numbers=0;
        for(Map.Entry<String,String> entry : personMap.entrySet()){
            if(entry.getValue().equals(name)){
                numbers++;
            }
        }
        if(numbers==0){
            System.out.println("Name not found");
        } else if (numbers==1) {
            System.out.println("One person with name " + name + " found");
        }else if (numbers==2) {
            System.out.println("Two persons with name " + name + " found");
        } else{
            System.out.println("More than two persons with name " + name + " found");
        }


    }
    public void remove(String name){
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
       while(iterator.hasNext()){
           Map.Entry<String, String> entry = iterator.next();
           if(entry.getValue().equals(name)){
               iterator.remove();
           }
       }
    }
    public void print(){
        for(Map.Entry<String,String> entry : personMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
