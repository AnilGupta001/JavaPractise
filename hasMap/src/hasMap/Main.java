package hasMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	   public static void main(String args[]) {

	        ArrayList<String> al = new ArrayList<>();

	        al.add("one");
	        al.add("two");
	        al.add("three");
	        al.add("one");//dupli̥cate element
	        al.add(null);
	        al.add("four");
	        al.add(null); //duplicate null
	        Iterator<String> itr= al.iterator();
	    	
	        while(itr.hasNext()){
	            String s= itr.next();
	            System.out.println(s);
	        }
	        System.out.print("------------------------");
	        for(int i=0;i<al.size();i++){
	            System.out.println(al.get(i));
	         }
	        for(String s: al){
	            System.out.println(s);
	        }
	        System.out.println(al);
	        System.out.println(al.size());
	        
	        ArrayList<Integer> all = new ArrayList<>();
	        
	                all.add(10);
	                all.add(20);
	                all.add(30);
	                all.add(40);
	                all.add(50);


	                for(int x: all){
	                    System.out.println(x);
	                }
	                System.out.println("--------------------------------------");
	            
	   ArrayList<Integer> a = new ArrayList<>();

       a.add(10);
       a.add(20);
       a.add(30);
       a.add(40);
       a.add(50);

       System.out.println(a.contains(20));
       System.out.println(a.contains(80));
	        
       System.out.println("--------------------------------------");
       
	   ArrayList<Integer> l = new ArrayList<>();

       l.add(10);
       l.add(20);
       l.add(30);
       l.add(40);
       l.add(50);

         Object[] or= a.toArray();

         for(Object o:or){
             int x= (Integer)o;
             System.out.println(or);
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		 
            		
         }
}
}
