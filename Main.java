package client;

public class Main {
	
	
	private final String studentID;
	private final String firstname;
	private final String surname;
	private final int age;
	private final String course;
	private final String courseID;
	private final String module;
	private int score;
	
	
	public Main(String studentID, 
				String firstname,
				String surname,
				int age, 
				String course, 
				String courseID, 
				String module, 
				int score) {
		
		
		this.firstname = firstname;
		this.surname = surname;
		this.studentID = studentID;
		this.age = age;
		this.score = score;
		this.course = course;
		this.courseID = courseID;
		this.module = module;
	}
	
	
	public static void main(String[] args) {

        Register register = new Register();

        // Student ID, Firstname, surname, age, course, Course ID, Module, score
        register.addStudent("1001", "Emma", "Thompson", 22, "Computer Science", "CS101", "Programming Fundamentals", 87);
        register.addStudent("1002", "Michael", "Rodriguez", 20, "Biology", "BIO201", "Genetics", 92);
        register.addStudent("1003", "Sarah", "Davis", 21, "Psychology", "PSY101", "Introduction to Psychology", 78);
        register.addStudent("1004", "Kevin", "White", 23, "Economics", "Eco301", "Economics", 76);
        register.addStudent("1005", "Olivia", "Turner", 19, "Engineering", "ENG202", "Circuit Analysis", 90);
        register.addStudent("1006", "Ethan", "Miller", 20, "Computer Science", "CS101", "Programming Fundamentals", 77);
        register.addStudent("1007", "Henry", "Turner", 20, "Computer Science", "CS101", "Web Development", 65);
        
        
        // Display all students
        System.out.println("All Students:");
        register.displayAllStudents();
        System.out.println();
        
        //Order the students by score, descending
        System.out.println("Students sorted by score descending order:");
        register.displayStudents(register.getStudentsSortedByScore(0));
        System.out.println();
        
        //Students sorted by first initial, in this case "E"
        System.out.println("Students sorted by first initial 'E' of first name");
        register.displayStudents(register.getStudentsWithNameStartingWith('E'));
        System.out.println();
        
        //First Null is course, second is student name
        System.out.println("Students on Computer Science Course whos name is 'Emma'");
        register.displayStudents(register.getStudentsOnCertainCourse("Computer Science", "Emma"));
        System.out.println();
        
        //Students sorted by particular surname
        System.out.println("Students sorted by Surname");
        register.displayStudents(register.getStudentLastName("Turner"));
        System.out.println();
        
        // Students sorted by specific module
        System.out.println("Students sorted by Specific Module, 'Programming Fundamentals'");
        register.displayStudents(register.getStudentOnModule("Programming Fundamentals"));
        System.out.println();
        
        // students sorted by ID
        System.out.println("Students sorted by StudentID");
        register.displayStudents(register.getStudentID("1006"));
        System.out.println();
    }
	
		public String getCourse() {
			return course;
		}
	
		public String getModule() {
			return module;
		}
	
		public String getcourseID() {
			return courseID;
		}
	
		public String getstudentID() {
			return studentID;
		}
		
		public String getfirstname() {
			return firstname;
		}
		public String getsurname() {
			return surname;
		}
		
		public int getage() {
			return age;
		}
		
		public int getscore() {
			return score;
		}
		
		@Override
	    public String toString() {
	        return "Studentid=" + studentID + "| name='" 
	        		+ firstname + " " + surname + "'| age=" 
	        		+ age + " | course='" + course + "'| courseid=" 
	        		+ courseID + "| Module='" + module +
	                "'| score=" + score;
		}
		
		
}
