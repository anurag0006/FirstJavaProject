
public class runfile {

	public static void main(String[] args) {
		student ansh = new student("ansh",4008,"apm","robotics","cricket","dg 2",504,"9877240866","student",19);
	    Professor anurag = new Professor("Anurag",25,"professor",101,"mathematics",5,10,1200000);
	    NonTeachingStaff anish = new NonTeachingStaff("anish",980000,30,"office head","m tech","office job");
	    Wardons aniket = new Wardons("aniket","phd","dg 2",300000,8,55,"wardon");
	    StudentsHead Kamboj= new StudentsHead("kamboj","cse",22,"college president",4,"Student");
	    System.out.println("-------------------------------------------------------------------------------------------");
	    ansh.print_details(); 
	    System.out.println("-------------------------------------------------------------------------------------------");
	    anurag.print_details();
	    System.out.println("-------------------------------------------------------------------------------------------");
	    anish.print_details();
	    System.out.println("-------------------------------------------------------------------------------------------");
	    aniket.print_details();
	    System.out.println("-------------------------------------------------------------------------------------------");
	    Kamboj.print_details();
	    System.out.println("-------------------------------------------------------------------------------------------");
	    aniket.warn_student(ansh);
	    aniket.call_Parents(ansh);
	   } 
	

}
