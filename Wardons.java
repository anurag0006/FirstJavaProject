
public class Wardons extends person{
     private String qualification;
     private String HostelAlloted;
     private int salary;
     private int rating;

Wardons(String name, String qualification, String HostelAlloted, int salary, int rating,int age, String occupation){
	this.name = name;
	this.qualification = qualification;
	this.HostelAlloted = HostelAlloted;
	this.salary = salary;
	this.rating = rating;
	this.age = age;
	this.occupation = occupation;
}

 String get_name() {
	 return name;
 }
 String get_qualification() {
	 return qualification;
 }

 String get_hostel() {
	 return HostelAlloted;
 }

 int get_salary() {
	 return salary;
 }
 int get_rating() {
	 return rating;
 }
 
 void print_details() {
	 System.out.println("the name of the wardon is "+ name);
	   System.out.println("qualification :"+qualification);
	   System.out.println("hostel alloted :"+HostelAlloted);
	   System.out.println("rating :"+ rating);   
}
 void warn_student(student x)
 {
	 System.out.println("Warned the student " + x.get_name());
 }
 void call_Parents(student x) 
 {
	 System.out.println("Calling parents of " + x.get_name() + " at number " + x.get_Number());
 } 
}