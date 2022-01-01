// Different use cases of lambda expressions:
// Here we are using :  
/*
    1. Collections with user defined class Groceries as objjects
    2. Uses Comparator to sort the list by name as well as sort by cost
    3. Uses Lambda expressions  to print the list contents using forEach loop
*/    
import java.util.*;

class Groceries
{
    String item;int cost;

    Groceries(String item,int cost)
    {
        this.item=item;  this.cost=cost;
    }

    public String toString()
    {
        return this.item+" " + this.cost;
    }
    
}
interface GenericInterfaceEg<T,E>
{
    public E multiUseFunc(T ob);
}

class sortByName implements Comparator<Groceries>
{
    public int compare(Groceries a,Groceries b)
    {
        return(a.item.compareTo(b.item));
    }
}
class sortByCost implements Comparator<Groceries>
{
    public int compare(Groceries a,Groceries b)
    {
        return(a.cost-b.cost);
    }
}
public class LambdaExpressions
{
    public static void main(String args[])
    {
        //Creating an array list of Groceries class objects
        List<Groceries> l=new ArrayList<Groceries>();
        

        l.add(new Groceries("milk",20));
        l.add(new Groceries("chocco",15));
        l.add(new Groceries("cake",300));

            l.forEach((n)->System.out.println(n));

        Collections.sort(l,new sortByName());

            l.forEach((n)->System.out.println(n));

        Collections.sort(l,new sortByCost());

            l.forEach((n)->System.out.println(n));
    
      /*           String nameList="";
        // the generic interface is used for strings (item names)
        GenericInterfaceEg<Groceries,String> ob=(name)->{  l.forEach((n)->nameList=nameList.concat(n.item+" ")); return nameList; };
    */
}
}