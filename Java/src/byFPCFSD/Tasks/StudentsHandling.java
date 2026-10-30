package byFPCFSD.Tasks;
import java.util.*;
public class StudentsHandling {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter No Of Students : ");
        int NoOfStudents = in.nextInt();
        LinkedHashMap<Integer,LinkedHashMap<String,Object>> data= new LinkedHashMap<>();

        for (int i = 0; i < NoOfStudents; i++) {
            System.out.print("Enter Student Id : ");
            int id = in.nextInt();
            LinkedHashMap<String ,Object> currentStd = new LinkedHashMap<>();
            in.nextLine();

            System.out.print("Enter Student "+id+" Name : ");
            currentStd.put("name",in.nextLine());

            System.out.print("Enter Student "+id+" Department : ");
            currentStd.put("department",in.nextLine());

            System.out.print("Enter Student "+id+" Mark : ");
            currentStd.put("mark",in.nextInt());

            if (data.containsKey(id)) {
                System.out.print("Student ID already exists! Try another ID.");
                continue;
            }

            data.put(id,currentStd);
        }
        for (int id : data.keySet()) {
            System.out.println("Student ID :"+id);
            System.out.println("Student Name :"+data.get(id).get("name"));
            System.out.println("Student Depatment :"+data.get(id).get("department"));
            System.out.println("Student Mark :"+data.get(id).get("mark"));
            System.out.println();
        }


    }
}
