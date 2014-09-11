package serialization;

import java.io.Serializable;

public class SchoolStudent extends Student implements Serializable
{

	public SchoolStudent(int id, String name, Marks marks, String schoolName)
	{
		super(id, name, marks);

		this.schoolName = schoolName;
	}

	String schoolName;
			


}
