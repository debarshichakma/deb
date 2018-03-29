import java.util.ArrayList;
import java.util.Arrays;

public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	ArrayList<String> al = new ArrayList<String>();
        System.out.println("initial Size of al: " + al.size());
        
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        System.out.println("Before Replacing "+ al);
        //Replacing the element at index 1 with '000'
        
       al.set(1, "000");
       System.out.println("After replacing " + al);
        
        al.add(1,"AZ");
        System.out.println("Size of al After Additions:" + al.size());
        System.out.println("content of al: "+ al);
        //Remove elements from the array list
        
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions:"+al.size());
        System.out.println("Content of al:" + al);
        System.out.println(al.get(1));
        System.out.println(al.indexOf("E"));
		
		

	}

}
