package client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Main> main;
    
    public static void main(String[] args) {
    
    }

    public Register() {
        this.main = new ArrayList<>();
    }
    
    // Student ID, Name, age, course, Course ID, Module, score
    public void addStudent(String studentID, String firstname, String surname, int age, String course, String courseID, String module, int score) {
        main.add(new Main(studentID, firstname, surname, age, course, courseID, module, score));
    }

    public void removeStudent(String studentId) {
        main.removeIf(main -> main.getstudentID().equals(studentId));
    }

    public void displayAllStudents() {
        main.forEach(System.out::println);
    }

    public void displayStudents(List<Main> studentList) {
        studentList.forEach(System.out::println);
    }
    
    public List<Main> getStudentsSortedByScore(int score) {
        return main.stream()           
                .sorted(Comparator.comparingInt(Main::getscore).reversed())
                .collect(Collectors.toList());
    }
    
    public List<Main> getStudentsWithNameStartingWith(char letter) {
        return main.stream()
                .filter(main -> main.getfirstname().charAt(0) == letter)
                .collect(Collectors.toList());
    }
    
    public List<Main> getStudentsOnCertainCourse(String course, String name) {
    	return main.stream()
    			.filter(main -> main.getCourse().equals(course))
    			.filter(main -> main.getfirstname().contains(name))
    			.collect(Collectors.toList());
    }
    
    public List<Main> getStudentLastName(String name) {
    	return main.stream()
    			.filter(main -> main.getsurname().equals(name))
    			.collect(Collectors.toList());
    }
    
    public List<Main> getStudentID(String ID) {
    	return main.stream()
    			.filter(main -> main.getstudentID().equals(ID))
    			.collect(Collectors.toList());
    }
    
    public List<Main> getStudentOnModule(String module) {
    	return main.stream()
    			.filter(main -> main.getModule().equals(module))
    			.collect(Collectors.toList());
    }
}

