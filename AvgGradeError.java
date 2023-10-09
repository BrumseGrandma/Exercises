public class AvgGradeError 
{
    static int[] grades = {4, 7, 02, 00, 10, 4, 12};
    static int getGrade (int courseid) 
    {
        int grade = grades[courseid];
        if (grade >= 02) 
        {
            return grade;
        } 
        else 
        {
            throw new Error();
        }
    }
    public static void main (String[] args) 
    {
        int count = 0;
        int sum = 0;
        
        for (int courseid=0 ; courseid<grades.length ; courseid++) 
        {
            try 
            {
                sum += getGrade(courseid);
                count++;
            } 
            catch (Error _e) 
            {	
            }
        }
        System.out.println("Average grade is "+((float)sum/count));
    }
}