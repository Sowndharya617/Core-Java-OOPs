package Problems;

public class University {
	public class Department{
		String depName;
		int facultyCount;
		
		Department(String name,int count){
			this.depName = name;
			this.facultyCount = count;
		}
		
		void displayInfo() {
			System.out.println("Department Name : "+depName);
			System.out.println("Total Faculties : "+facultyCount);
			
		}
		
	}
	
	public static void main(String[]args) {
		University u = new University();
		University.Department d = u.new Department("Artificial Intelligence and Data Science",5);
		University.Department d2 = u.new Department("AI&ML",5);
		d.displayInfo();
		d2.displayInfo();
	}
	
}
