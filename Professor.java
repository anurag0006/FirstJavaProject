 
 public class Professor extends person{
	
   private int id_no;
   private String department;
   private int experience;
   private int rating;
   private int salary;
   
   
   int get_id_no()
   {
	   return id_no;
   }
   String get_department()
   {
	   return department;
   }
   int get_experience()
   {
	   return experience;
   }
   int get_rating()
   {
	   return rating;
   }
   int get_salary()
   {
	   return salary;
   }

   
   
   
   public Professor(String nm,int age , String occupation, int id,String dep,int exp,int ratg,int sal) {
	   name = nm;
	   this.age = age ;
	   this.occupation = occupation;
	   id = id_no;
	   department = dep;
	   experience = exp;
	   rating = ratg;
	   salary = sal;
   }
   
   void update_rating(int x)
   {
	   rating = x;
   }
   void update_salary(int x) {
	   salary = x;
   }
   
   void print_details()
   {
	   System.out.println("the name of the profeesor is "+ name);
	   System.out.println("the id_no = "+ id_no);
	   System.out.println("department : "+ department);
	   System.out.println("rating :"+ rating);
	   System.out.println("age :"+age);
	   System.out.println("experience :"+experience);
   }
}


