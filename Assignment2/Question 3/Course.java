
public class Course {
	private String courseName;
	private String[] students = new String[10];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
		this.numberOfStudents = 0;
	}
	public String getCourseName() {
		return courseName;
	}
	public void addStudent(String student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else {
			System.out.println("The course if full.");
		}
	}
	public void dropStudent(String student) {
		for (int x = 0; x < numberOfStudents; x++ ) {
			if (students[x].equals(student)) {
				for (int y = x; y < numberOfStudents - 1; y++) {
					students[y] = students[y + 1];
				}
				students[numberOfStudents - 1] = null;
				numberOfStudents--;
				break;
			}
		}
	}
	public String[] getStudents() {
		String[] actualStudents = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			actualStudents[i] = students[i];
		}
		return actualStudents;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}
