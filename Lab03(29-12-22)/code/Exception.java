import java.util.Scanner;

public class Exception {
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the number of students: ");
    int n = sc.nextInt();
    
    String[][] studentDetails = new String[n][4];
    
    for(int i=0; i<n; i++) {
      for(int j=0; j<4; j++) {
        studentDetails[i][j] = sc.next();
      }
    }
   
    System.out.println("Student Details:");
    System.out.println("Name      ID      Attendance      Marks");
    for(int i=0; i<n; i++) {
      for(int j=0; j<4; j++) {
        System.out.print(studentDetails[i][j]+"      ");
      }
      System.out.println();
    }
   
    for(int i=0; i<n; i++) {
      if(Integer.parseInt(studentDetails[i][2]) <= 60) {
        try {

          throw new LessattendanceException("Student "+studentDetails[i][0]+" has less than 60% attendance.");
        }
        catch(LessattendanceException a) {
			System.out.println(a);
          
        }
      }
    }
  }
}
