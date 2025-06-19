package MVC;
//Main.java
public class Main {
 public static void main(String[] args) {
     // Create model
     Student student = new Student("Deepika", "S101", "A+");

     // Create view
     StudentView view = new StudentView();

     // Create controller
     StudentController controller = new StudentController(student, view);

     // Display original student data
     controller.updateView();

     // Update student details using controller
     controller.setStudentName("Priya");
     controller.setStudentGrade("A");

     // Display updated student data
     controller.updateView();
 }
}
