package MVC;
//StudentController.java
public class StudentController {
 private Student student;
 private StudentView view;

 // Constructor
 public StudentController(Student student, StudentView view) {
     this.student = student;
     this.view = view;
 }

 // Setters to update model data
 public void setStudentName(String name) { student.setName(name); }
 public void setStudentId(String id) { student.setId(id); }
 public void setStudentGrade(String grade) { student.setGrade(grade); }

 // Getters
 public String getStudentName() { return student.getName(); }
 public String getStudentId() { return student.getId(); }
 public String getStudentGrade() { return student.getGrade(); }

 // Method to update the view
 public void updateView() {
     view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
 }
}
