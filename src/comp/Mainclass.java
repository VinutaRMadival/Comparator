package comp;

import java.util.ArrayList;
import java.util.Collections;

import comparator.AgeComparator;
import comparator.NameComparator;
import comparator.Student;

public class Mainclass {
	
		public static void main(String[] args) {
			ArrayList<Student> al=new ArrayList<Student>();
			al.add(new Student(101,"vijay",23));
			al.add(new Student(106,"Ajay",27));
			al.add(new Student(105,"Jai",21));
			System.out.println("sorting by names");
			Collections.sort(al,new NameComparator());
			
			for(Student st:al)
			{
				System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
			System.out.println();
			System.out.println("sorting by age");
			Collections.sort(al,new AgeComparator());
			for(Student st:al)
			{
				System.out.println(st.rollno+" "+st.name+" "+st.age);
			}
		}
}

	