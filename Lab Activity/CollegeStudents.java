class CollegeStudents {
	int id;
	String name, course;

	CollegeStudents(int i, String n, String c) {
		id = i;
		name = n;
		course = c;
	}

	void display() {
		System.out.println(id + " " + name + " " + course);
	}

	public static void main(String[] args) {
		CollegeStudents st = new CollegeStudents(10, "kamlendra", "java full course");
		st.display();

	}

}