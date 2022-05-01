package com.example.domain.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomeNote {

    public static List<String> m = new ArrayList<>();
    public static List<String> n = new ArrayList<>();

    public static void main(String[] arr) {
        m.add("two");
        m.add("times");
        m.add("three");
        m.add("is");
        m.add("not");
        m.add("four");

        n.add("two");
        n.add("times");
        n.add("two");
        n.add("is");
        n.add("four");
        checkMagazine(m,n);
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        //corner case 1.
        if(note==null){
            System.out.println("No");
            return;
        }
//corner case 2.
        if(note.size() > magazine.size()){
            System.out.println("No");
            return;
        }
//store the Magazine string array element in the HashMap and keep count.
        HashMap<String, Integer> hm= new HashMap<String, Integer>();
        for(int i=magazine.size()-1;i>=0;i--){
            if(hm.containsKey(magazine.get(i))){
                hm.put(magazine.get(i), hm.get(magazine.get(i))+1);
            }else{
                hm.put(magazine.get(i),1);
            }
        }
//Traverse through the Hash Map and compare the Note string array elements to the Magazine string array elements.Subtract 1 from the value a matching string. If you find anyvalue in the HashMap less than 0, you should print No.
        for(int i=note.size()-1;i>=0;i--){
            if(hm.containsKey(note.get(i))){
                hm.put(note.get(i), hm.get(note.get(i)) - 1);
                if(hm.get(note.get(i)) < 0){
                    System.out.println("No");
                    return;
                }
            }else{
                System.out.println("No");
                return;
            }
        }
//Anything else should give a Yes.
        System.out.println("Yes");
    }
}
