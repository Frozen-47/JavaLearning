package byFPCFSD.Collection.TreeeSet;
import  java.util.TreeSet;
import  java.util.Scanner;
public class TreeeSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        for(int i = 0;i < 5;i++){
            numbers.add(in.nextInt());
        }
        System.out.println(numbers);
        System.out.println(numbers.first());
        numbers.pollFirst();
        System.out.print(numbers);
        try{
            numbers.add(null);
        }
        catch (NullPointerException e){
            System.out.println("Null not allowed :"+e);
        }
        numbers.pollLast();
        System.out.print(numbers);
    }
}
