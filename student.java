
public class student extends person{
	private int roll_no;
	private String branch;
	private String club_joined;
	private String fav_sport;
	private String hostel_alloted;
	private int room_no;
	private String ParentsNO;
	
	// for the average gpa of all the semesters atteneded till date;
	
	
	student (String name,int roll_no, String branch,String fav_club, String fav_sport,String hostel_alloted,int room_no, String no,String occupation,int age )
	{
		this.name = name;
		this.roll_no = roll_no;
		this.branch = branch;
		this.club_joined = fav_club;
		this.fav_sport = fav_sport;
		this.hostel_alloted = hostel_alloted;
		this.room_no = room_no;
		this.ParentsNO = no;
		this.occupation = occupation;
		this.age = age;
	}
	
	String get_name()
	{
		return name;
	}
	int get_roll_no() {
	return roll_no;
	}
	String get_branch()
	{
		return branch;
	}
	String get_fav_club()
	{
		return club_joined;
	}
	String get_fav_sport()
	{
		return fav_sport;
	}
	String get_hostel()
	{
		return hostel_alloted;
	}
	int get_room_no()
	{
		return room_no;
	}
	String get_Number() {
		return ParentsNO;
	}
	
	
	void print_details()
	{
		System.out.println("the name of the student is "+ get_name());
		System.out.println("roll_no : "+ get_roll_no());
		System.out.println("branch : " + get_branch());
		System.out.println("fav_sport : " + get_fav_sport());
		System.out.println("club joined :" + get_fav_club());
		System.out.println("hostel alloted :"+get_hostel());
		System.out.println("room no :" + get_room_no());
		System.out.println("parents number :"+ get_Number());
	}
	
	

}
