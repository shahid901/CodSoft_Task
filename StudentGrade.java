import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {
        int count, i;
        float totalMarks=0, percentage;
        Scanner sc;
        sc=new Scanner(System.in);
        
        System.out.println("Enter Number of Subject: ");
        count=sc.nextInt();

        System.out.println("Enter Marks of Subject from 100 ");
        for (i=0; i<count; i++) {
            totalMarks+=sc.nextInt();
        }
        System.out.println("Total Marks: "+totalMarks);
        
        percentage=(totalMarks/(count*100))*100;
        System.out.println("Percentage: "+percentage);
        
        if (percentage<=100 && percentage>=81)
        {
        	System.out.println("Grade A++");
        }
        else if (percentage<=80 && percentage>=61)
        {
        	System.out.println("Grade A");
        }
        else if (percentage<=60 && percentage>=51)
        {
        	System.out.println("Grade B");
        }
        else if (percentage<=50 && percentage>=35)
        {
        	System.out.println("Grade C");
        }
        else
        {
        	System.out.println("Fail");
        }
    }
}