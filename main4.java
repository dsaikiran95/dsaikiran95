class StudentDetails
{
    String name;
    int Rollno;
    String Section;
    int internal_marks;
    int external_marks;
    int project_marks;
    
    void grade()
    {
        float total_marks;
        float Percentage;
      
		total_marks = internal_marks+external_marks+project_marks;
	    Percentage = (total_marks / 300) * 100;
	    System.out.println(" total_marks =  " + total_marks);
	    System.out.println(" Marks Percentage =  " + Percentage);
	    if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	
    }
    
}

class main4
{
    public static void main(String[] args)
    {
        StudentDetails std1 = new StudentDetails();
        std1.name="SAI KIRAN";
        std1.Rollno=102;
        std1.Section="A";
        std1.internal_marks=90;
        std1.external_marks=70;
        std1.project_marks=99;
        System.out.println("Details of student1: ");
        System.out.println(std1.name+" "+std1.Rollno+" "+std1.Section+" "+std1.internal_marks+" "+std1.external_marks+" "+std1.project_marks);
        std1.grade();
        
        StudentDetails std2 = new StudentDetails();
        std2.name="RAMINENI V N SEETHARAM";
        std2.Rollno=103;
        std2.Section="A";
        std2.internal_marks=80;
        std2.external_marks=90;
        std2.project_marks=90;
        System.out.println("Details of student2: ");
        System.out.println(std2.name+" "+std2.Rollno+" "+std2.Section+" "+std2.internal_marks+" "+std2.external_marks+" "+std2.project_marks);
        std2.grade();
        
    }
}