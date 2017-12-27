package javaGenerics;

public class GenericsTypesInMethod {

	public static <T> boolean areEqual(GenericsType<T> t1, GenericsType<T> t2)
    {        
        return t1.get().equals(t2.get());
    }
     
    public static void main(String args[])
    {
    
        GenericsType<String> firstString = new GenericsType<String>();        
        firstString.set("MeritCampus");                 
        GenericsType<String> secondString = new GenericsType<String>();        
        secondString.set("MeritCampus");                 
        boolean areEqual;
        //areEqual = GenericsTypesInMethod.areEqual(firstString, secondString);
        areEqual =GenericsTypesInMethod.<String>areEqual(firstString, secondString);
        System.out.println("Are the given two strings equal ? " +areEqual );
    }
}

class GenericsType<T>
{
private T object;
    
public T get()
{
    return this.object;
}
     
public void set(T object)
{
    this.object = object;

	}

}
