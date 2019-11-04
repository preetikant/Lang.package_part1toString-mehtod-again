class Student{
	
		String name;
		int rollno;
		Student(String name, int rollno){
		
			this.name=name;
			this.rollno=rollno;
		}
		public static void main(String args[]){
		Student s1= new Student("Shefali",101);
		Student s2=new Student("Rohab",102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}