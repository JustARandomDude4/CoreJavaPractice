// Different use cases of lambda expressions:


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

/*interface PriceCompare<T>   // a generic interface
{
   public T sorting(T t);
}*/

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

    }
}
