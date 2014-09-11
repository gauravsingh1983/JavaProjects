package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Persist
{
	public static void main(String args[]) throws Exception
	{
		Student s1 = new SchoolStudent(211, "ravi", new Marks(100, 100, 100), "St. Michael's");

		FileOutputStream fout = new FileOutputStream("c:/test/f.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		out.flush();

	    FileInputStream inputFileStream = new FileInputStream("c:/test/f.ser");
	    ObjectInputStream objectInputStream = new ObjectInputStream(inputFileStream);
	    Student  deserializedStudent = (Student)objectInputStream.readObject();
	    
		System.out.println(deserializedStudent.testValue);
	}
}