package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
	private int		marks;
	private String	name;

	public Student(int marks, String name)
	{
		this.marks = marks;
		this.name = name;
	}

	public int getMarks()
	{
		return marks;
	}

	public String getName()
	{
		return name;
	}

	public int compareTo(Student st1)
	{
		return this.name.compareTo(st1.name);
	}
}

public class StudentSortByMarks implements Comparator<Student>
{
	public int compare(Student st1, Student st2)
	{
		int val = st1.getMarks() - st2.getMarks(); 
		
		if(val==0)
		{
			val = st1.getName().compareTo(st2.getName());
		}
		
		return val;
	}

	public static void main(String args[])
	{
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(50, "Rao"));
		studentList.add(new Student(40, "Seth"));
		studentList.add(new Student(50, "Kunal"));
		studentList.add(new Student(20, "Reddy"));
		studentList.add(new Student(30, "Nidhi"));
		//Collections.sort(studentList);
		Collections.sort(studentList, new StudentSortByMarks());
		for (Student st : studentList)
		{
			System.out.println(st.getMarks() + " : " + st.getName());
		}
	}
}