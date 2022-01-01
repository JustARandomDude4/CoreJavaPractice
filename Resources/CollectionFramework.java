/*
import java.util.*;
class Student 
{
    String name;int marks;
    Student(String name,int marks)
    {
        this.name=name; this.marks=marks; 
    }
//To represe any objent as a string: toString method used
    public String toString()     // when we call get metho(), this method concats and sends detials
    {
 
        // Returning attributes of Student
        return this.marks + " " + this.name ;
    }

}

class sortByName implements Comparator<Student>
{
    public int compare(Student a,Student b) {   return(a.name.compareTo(b.name)); }
}

class sortBymarks implements Comparator<Student>
{
    public int compare(Student a,Student b) {   return(a.marks-b.marks); }
}




public class CollectionFramework {
    public static void main(String[] args) throws Exception
     {
        Scanner s=new Scanner(System.in);

    //ArrayList :
        ArrayList al=new ArrayList();
        System.out.println("Enter no of names u wanna enter :");
        int no=s.nextInt();
        System.out.print("Enter names \n2:");
        for(int i=0;i<no;i++) { al.add(s.next());}

 
    //LinkedList:
        LinkedList ll=new LinkedList();
        
        System.out.println("Enter no of names u wanna enter :");
        no=s.nextInt();
        System.out.print("Enter names :\n");
        for(int i=0;i<no;i++) { ll.add(s.next());}
        ll.addLast("chaha");
        ll.addFirst("sita");
        ll.remove("chaha");

    //Priority queue         NoIterator
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add("amma");
        pq.offer("nanna");
        pq.add("sahi");
        pq.offer("ammamma");

        pq.remove();

        //Printing priority queue elements
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.element());

    //HashSet         hasIterator
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(2);
        hs.add(5);

    //Treeet         hasIterator
    TreeSet<Integer> ts=new TreeSet<Integer>();
    ts.add(20);
    ts.add(50);

    
        //printing Array and linked list elements
        Iterator i1, i2;
        i1=al.iterator();           i2 =ll.iterator();
        
        while(i1.hasNext())     {  System.out.print(i1.next()+" ");  }
        System.out.println();
        while(i2.hasNext())     {  System.out.print(i2.next()+" ");  }
        System.out.println();
        //printing HelementsashSet and TreeSet elements
        Iterator<Integer> j1, j2;
        j1=hs.iterator();           j2 =ts.iterator();
        
        while(j1.hasNext())     {  System.out.print(j1.next()+" ");  }
        System.out.println();
        while(j2.hasNext())     {  System.out.print(j2.next()+" ");  }
         
        //Mapsnot part of ccollecctionF  and dont implement  iterable
        //Hashmap
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
      // get() and put()
        hm.put("Satwi",new Integer(12));
        hm.put("Sahi",new Integer(15));
        hm.put("harini",new Integer(52));
        hm.put("Sj",new Integer(122));

        //since they cant iter, we first
       // entrySet() returns A SET withe map entries

        Set<Map.Entry<String,Integer>>set =hm.entrySet();
        
        for(Map.Entry<String,Integer>i:set)   {  System.out.println(i.getKey() + ":" + i.getValue());}
        System.out.println(hm.get("Sahi"));

        //Comparator

        ArrayList<Student> a=new ArrayList<Student>();

        a.add(new Student("Satwika",new Integer(100)));  
        a.add(new Student("sfss",50));  
        a.add(new Student("kste",550));  

        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));

        Collections.sort(a,new sortByName());

        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));

        Collections.sort(a,new sortBymarks());

        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));


    }
}

*/