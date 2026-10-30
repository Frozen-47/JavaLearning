package byFPCFSD.Collection.LinkedLst;

import java.util.*;

public class LinkedLst {
    public static void main(String[] args) {

        LinkedList name = new LinkedList();
        name.add("Sabareesh");
        name.add("G");
        name.add("Hello");
        System.out.print(name);
        name.remove(2);
        System.out.print(name);
    }
}
