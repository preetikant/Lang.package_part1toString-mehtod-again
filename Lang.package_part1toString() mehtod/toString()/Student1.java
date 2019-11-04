class Student1{

	String name;
	int rollno;
	Student1(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public String toString(){
		return "A student who has a name: "+ name+ "and rollno: "+ rollno;
	}
	public static void main(String args[]){
		Student1 s1= new Student1("Preeti",1473713025);
		Student1 s2=new Student1("Ruby",1473713016);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
	
}