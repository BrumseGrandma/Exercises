public class EnrollmentSystem
{
    Student[] students;
    Course[]  courses;
    public void enroll (Student student, Course course) 
    {
        this.students = new Student[0];
        this.courses = new Course[0];
        course.enroll(student);
    }
    
    public void remove (Student student, Course course)
    {
        course.remove(student);
    }
    
    public void showParticipants (Course course)
    {
        for (Student student: course.getParticipants())
        {
            System.out.println(student.getName());
        }
    }
    
    public void getCourses ()
    {
        System.out.println("void for a getter?");
    }
    
    public void getStudents ()
    {
        System.out.println("void for a getter?");
    }

    public void addStudent (Student student)
    {
        //avoid dublicates
        for (Student entry: students)
        {
            if (entry == student)
            {
                return;
            }
        }

        //create new list
        Student[] newlist = new Student[students.length+1];
        for (int i=0; i<students.length; i++)
        {
            newlist[i] = students[i];
        }
        newlist[students.length] = student;

        //override old reference
        students = newlist;
    }

    public void removeStudent (Student student)
    {
        int i;

        //find index of student
        for (i=0; i<students.length; i++)
        {
            if (students[i] == student)
            {
                break;
            }
        }

        //guard: student not on list
        if(i == students.length)
        {
            return;
        }

        //create new list
        Student[] newlist = new Student[students.length-1];
        int n = 0;
        for (int o=0; 0<students.length; o++)
        {
            if (o != i)
            {
                newlist[n++] = students[o];
            }
            o++;
        }

        newlist[students.length] = student;

        //override old reference
        students = newlist;
    }
}