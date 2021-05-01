
public class Main {

	public static void main(String[] args) {
		
			
		User student=new User ();
		student.setFirstName("Burak");
		student.setLastName("Öztaş");
		student.setId(1);
		
		User student2=new User ();
		student2.setFirstName("Pelte");
		student2.setLastName("Tombiş");
		student2.setId(2);
		
		User instructor =new User();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setId(100);
		
		User instructor2 =new User();
		instructor2.setFirstName("Atıl ");
		instructor2.setLastName("Samancıogğlu");
		instructor2.setId(101);
		
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getId());
		
		StudentManager studentManager=new StudentManager();
		studentManager.add();
		
		System.out.println(student2.getFirstName());
		System.out.println(student2.getLastName());
		System.out.println(student2.getId());
		
		StudentManager studentManager2=new StudentManager();
		studentManager2.add();
		
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getLastName());
		System.out.println(instructor.getId());
		
		InstructorManager instructorManager2=new InstructorManager();
		instructorManager2.add();
		
		System.out.println(instructor2.getFirstName());
		System.out.println(instructor2.getLastName());
		System.out.println(instructor2.getId());
				
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add();
		
		
		
		
		
	}

}
