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

        switch((int)percentage/10) {
        case 9:
            System.out.println("Grade O");
            break;
        case 8:
         	System.out.println("Grade A+");
            break;
        case 7:
            System.out.println("Grade A");
            break;
        case 6: case 5:
            System.out.println("Grade B");
            break;
        case 4:
            System.out.println("Grade C");
            break;
        default:
            System.out.println("Fail");
            break;
        }
    }
}
