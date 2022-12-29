abstract class College{

int clgid;
String name;

College(int a,String b){
 this.clgid=a;
 this.name=b;
}

void display()
{
System.out.println("College Id: "+clgid + "\tCollege Name: "+name);
}

abstract void dept(int stud,String deptname);
}


class Details extends College{
    Details(int a, String b)
	{
	 super(a,b);
	}
	void dept(int stud,String deptname)
	{
	 System.out.println("\nDepartname Name: "+deptname);
	 System.out.println("\nNumber of Student Present in "+deptname+" is "+stud);
	}
}
	
	class ClgDept{
	public static void main(String args[]){
	  Details n = new Details(2122,"Saveetha Engineering College");
	  n.display();
	  n.dept(32,"Information Technology");
	}
	}
