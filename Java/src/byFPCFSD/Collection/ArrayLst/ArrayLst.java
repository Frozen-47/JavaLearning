package byFPCFSD.Collection.ArrayLst;

import java.util.*;

public class ArrayLst {
    public static void main(String[] args) {

        ArrayList name = new ArrayList<>();
        name.add("Sabareesh");
        name.add("G");
        name.add("Hello");
        name.addAll(Arrays.asList(70, "Hello"));
        System.out.println(name);
        name.remove(2);
        System.out.print(name);
    }
}