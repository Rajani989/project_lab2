//This is a program of arrange string in length wise ascending order.
//example : This is a easiest example.
//output: a, is, the, easiest,example.
import java.util.*; 
public class String_asc {
	  public static void main(String[] args) { 
	     String str="This is a easiest example";  //declaration of string
	     String[] str1=str.split(" ");    //split the value of string
	     for(int i=0;i<str1.length;i++)     
	     { 
	         for(int j=i+1;j<str1.length;j++) 
	         { 
	           if(str1[i].length()>str1[j].length()) 
	           {        
	        	   //sort the string in ascending order
	             String temp= str1[i];   
	              str1[i]=str1[j]; 
	              str1[j]=temp; 
	            } 
	         } 
	   } 
	     //print the string value
	    for(int i=0;i<str1.length;i++) 
	    { 
	       System.out.print(str1[i]+" , ");  
	    } 
	  } 
}
