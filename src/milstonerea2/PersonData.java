package milstonerea2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List <Person>list=new ArrayList<Person>();
	list.add(new Person (11,24,9023,"sush"));
	list.add(new Person (12,25,6000,"nish"));
	list.add(new Person (14,28,1000,"kish"));
	list.add(new Person (16,26,10000,"lish"));
	list.add(new Person (17,78,6000,"hish"));
	list.add(new Person (9,22,2000,"jksh"));
	list.add(new Person (19,15,9000,"cush"));
	list.add(new Person (10,30,5000,"kysh"));
	list.add(new Person (9,31,11000,"mtsh"));
	list.add(new Person (18,25,2000,"mash"));
	   
		
		
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			
			System.out.println("1.Display the person");
			System.out.println("Display person by ascending order");
			System.out.println("update person oid with purchase amount");
			System.out.println("Enter ur choice");
			
			ch=sc.nextInt();
			switch (ch)
			{
			case 1:
				for(Person e:list)
				{
					System.out.println(e);
				}
				break;
			case 2:
				List<Person>l1=new ArrayList<>(list);
				Collections.sort(l1,new PersonComparator());
				for(Person e1:l1)
				{
					System.out.println(e1);
				}
				break;
			case 3:
				boolean found=false;
				System.out.println("Enter person id by therir purchase amount");
				int id1=sc.nextInt();
				ListIterator<Person> l2=list.listIterator();
				while(l2.hasNext())
				{
					Person e3=l2 .next();
					if(e3.getId()==id1)
					{
						System.out.println("Enter age");
						int age=sc.nextInt();
						System.out.println("Enter purchase amount ");
						int purchaseamount=sc.nextInt();
						System.out.println("Enter name");
						String name=sc.next();
						l2.set(new Person(id1,age,purchaseamount,name));
						found=true;
					}
				}if(!found)
					System.out.println("person not in list");
				else
					System.out.println("Update Successfull");
				
			}
			
		}while(ch!=0);

	}

}
