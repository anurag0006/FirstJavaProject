
public class NonTeachingStaff extends person{
	//private String name;
	private int salary;
	//private int age;
	private String position;
	private String qualification;
	
	
	NonTeachingStaff(String Name,int salary,int age ,String position, String qualification,String occupation){
		this.name = Name;
		this.salary = salary;
		this.age = age;
		this.position = position;
		this.qualification = qualification;
		this.occupation = occupation;
	}
	
	String get_name() {
		return name;
	}
	int get_salary() {
		return salary;
	}
	int get_age() {
		return age;
	}
	String get_position() {
		return position;
	}
	String get_qualification() {
		return qualification;
	}
	
	void update_salary(int n) {
		salary = n;
	}
	   void print_details() {
	   System.out.println("the name of the staff person is "+ name);
	   System.out.println("qualifications :"+qualification);
	   System.out.println("position : "+ position);
	   System.out.println("age :"+age);
	   }
}
