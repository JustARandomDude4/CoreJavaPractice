import java.util.*;
public class CollectionFramework {
    public static void main(String[] args) throws Exception
     {
        Scanner s=new Scanner(System.in);
        ArrayList al=new ArrayList();
        System.out.println("Enter no of names u wanna enter :");
        int no=s.nextInt();
        System.out.print("Enter no of names :");
        for(int i=0;i<no;i++) { al.add(s.next());}

        Iterator i;
        i=al.iterator();
        while(i.hasNext())    
        {
            System.out.println(i.next());
        }
         

    }
}
