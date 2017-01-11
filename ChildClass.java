/**
 * Child Class has grade field
 * @author greenml
 *
 */
public class ChildClass extends ParentClass {
	private int grade;  	// holds grade of child
	private String schoolName;
	
	

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
}
