package collectionsconcepts;

import java.util.Scanner;
import java.util.ArrayList;
public class Example1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<String>al=new ArrayList<String>();
        for(int i=0;i<=5;i++){
            String st=s.nextLine();
            al.add(st);
        }System.out.println(al);
        
    }
}
//example 1
//import java.util.Scanner;
import java.util.Collections;
//import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<=5;i++){
            int st=s.nextInt();
            al.add(st);
        }System.out.println(al);
         Collections.sort(al);
           System.out.println(al);
           System.out.println("to search an element :"+al.contains("hello"));
           
           System.out.println(al.isEmpty());
           al.clear();
           System.out.println("after clear:"+al);
        
    }
}


    }
}


	
