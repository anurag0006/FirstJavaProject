
public class StudentsHead extends person{
   private String branch;
   private String post; // won the election for which post; 
   private int year;    // the year in which he/she studies;


  StudentsHead(String name,String branch, int age, String post,int year,String occupation){
	  this.name = name;
	  this.branch = branch;
	  this.age = age;
	  this.post = post;
	  this.year = year;
	  this.occupation = occupation;
  }
  
  String get_name() {
	  return name;
  }
  String get_branch() {
	  return branch;
  }
  int get_age () {
	  return age;
  }
  String get_post() {
	  return post;
  }
 int get_year() {
	 return year;
 }
 
 void print_details() {
	 System.out.println("the name of the head is "+ name);
	   System.out.println("branch :"+branch);
	   System.out.println("post :"+post);
	   System.out.println("age :"+age);
	   System.out.println("year :" + year);
 }
}
