// An implementation of all methods and classes of  the List interface
import java.util.*;

 class List
 {
   public static  void main(String[] args) {


     //constructors of ArrayList
     ArrayList<String> a = new ArrayList<>();

     ArrayList<String> b = new ArrayList<>(16);

     ArrayList<String> c = new ArrayList<>(a);


    //methods

    a.add("cse");
    a.add("ece");
    a.add("civil");

    System.out.println(a);

    System.out.println();

    int ind = a.indexOf("cse");
    System.out.println(ind);

    ind = a.lastIndexOf("ece");
    System.out.println(ind);

     System.out.println();

   String dn = a.get(0);
   System.out.println(dn);

    System.out.println();
     System.out.println();

   ListIterator<String> iterator = a.listIterator();
   while(iterator.hasNext())
   {
     System.out.println(iterator.next());
   }


   a.remove(0);
    System.out.println(a);
     System.out.println();

     a.remove("ece");
      System.out.println(a);
       System.out.println();
       //
       // a.set(2,"MECH");
       //  System.out.println(a);
       //   System.out.println();





   }
 }
