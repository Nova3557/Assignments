package assignment;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedList<String> names = new LinkedList<>();
        
        names.add("Charlie");
        names.add("Buttons");
        names.add("Chase");
        names.add("Nini");
        names.add("Lily");
        names.add("Coco");
        
        System.out.println(names.contains("Chase"));
        System.out.println(names.get(2));
        System.out.println(names.isEmpty());
        System.out.println(names.lastIndexOf("Nini"));
        System.out.println(names.get(3));
        System.out.println(names.remove(4));
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.element());  
        System.out.println(names.set(1, "Coco"));
        System.out.println(names.size());
       
        		
        		
		
	
	}

}
