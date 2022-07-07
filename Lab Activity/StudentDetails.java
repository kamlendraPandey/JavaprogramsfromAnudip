/*
*@kamlendra pandey
*/
class Student {
	private int id;
	private String name, course;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setCourse(String c) {
		course = c;
	}

	public String getCourse() {
		return course;
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("kamlendra");
		System.out.println(st.getName());
		st.setName("Shivam");
		System.out.println(st.getName());
		st.setId(991);
		System.out.println(st.getId());
		st.setId(992);
		System.out.println(st.getId());
		st.setCourse("Java full course");
		System.out.println(st.getCourse());
		st.setCourse("full Stack web development");
		System.out.println(st.getCourse());

	}

}
