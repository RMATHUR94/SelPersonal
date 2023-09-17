package Section14;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Class116 {

	public static void regular()
	{
		 // Count the number of name starting with alphabet A
		  ArrayList<String> names = new ArrayList<String>();
		  names.add("Abhijeet");
		  names.add("Don");
		  names.add("Alikhya");
		  names.add("Adam");
		  names.add("Ram");
		  int count = 0;
		  
		  for(int i=0;i<names.size();i++)
		  {
			  String actual = names.get(i);
			  if(actual.startsWith("A"))
			  {
				  count++;
			  }
		  }
		  System.out.println(count);
		  }
	
	public static void streamCount()
	{
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("Abhijeet");
		  names.add("Don");
		  names.add("Alikhya");
		  names.add("Adam");
		  names.add("Aam");
		  //THERE IS NO OPTION FOR INTERMIDIATE OPTION IS THERE IS NO TERMINAL OPTION
		  //INTERMIDIATE OPTION WILL EXECUTE IF TERMINAL OPTION RETURN TRUE
		  //WE CAN CREATE STREAM
		  //HOW TO USE FILTER IN STREAM API
		  long count = names.stream().filter(s->s.startsWith("A")).count();
		  
		  System.out.println(count);
		  long d = Stream.of("ashoke","Bhola","Aswni","pini").filter(x->
		  {
			  x.startsWith("A");
			  return true;
		  }).count();
		  System.out.println(d);
		  //print all the name of array list
		  names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		  //for only one result
		  names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}	
	
	public static void streamMap()
	{
		//print name which have last letter as "a" with Uppercase
		Stream.of("ashoke","Bhola","Alakya","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter as a with uppercase and sorted
		List<String> firstname = Arrays.asList("Ashoke","Bhola","Alakya","Rama","Adam");
		firstname.stream().filter(x->x.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(x->System.out.println(x));
		//Merging two different lists
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("Man");
		  names.add("Don");
		  names.add("Kia");
		  Stream<String> newstream =Stream.concat(firstname.stream(),names.stream());
		  //newstream.sorted().forEach(p->System.out.println(p));
		  boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Rama"));
		  System.out.println(flag);
		  Assert.assertTrue(flag);
	}

	public static void streamCollect()
	{
		List<String> lf = Stream.of("ashoke","Bhola","Alakya","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	    System.out.println(lf.get(0));
	  //Assignment
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array
		//sort the array
		//values.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> sortvalue = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortvalue.get(2));
	}
	public static void main(String[] args) 
	{
		regular();
		streamCount();
		streamMap();
		streamCollect();
	}

}
