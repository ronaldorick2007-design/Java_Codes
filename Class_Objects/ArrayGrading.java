//Java Programme to calculate average mark of each student and whole class
//LOGIC:
//  Create a Student class and Instantiate objects,
//  assign an integer array(marks) for each student,
//  iterate through marks and print average
//  finally print class average

//Creating class Student
class Student{
    //Attributes
	public String name;
	public int[] marks;
	
    //Constructor
	Student(String name, int[] marks){
		this.name = name;
		this.marks = marks;
	}
}

//Main class
public class ArrayGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];                //=>Array of objects  
		
        //Creating an object and assigning int array to it
		int[] a = {80,90,100};
		students[0] = new Student("A",a);
		int[] b = {70,70,70};
		students[1] = new Student("B",b);
		int[] c = {60,70,80};
		students[2] = new Student("C",c);
		
        //Function call for class average
		double ca = classAvg(students);		
		System.out.println("Total Class Average: " + ca);

	}

    //static methods
	public static double classAvg(Student[] students){
		double classavg=0;
        //Iteration through Objects array
		for(Student s : students) {
			double m = 0;
            //Iteration through int array
			for(int i : s.marks) m += i;
			System.out.println("Student: " + s.name + " Average: " + m/3);
			classavg += m/3;
		}
        //Return value
		return classavg/3;
	}
}   
