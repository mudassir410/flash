package javaGenerics;

public class TasteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taste<Mango> mangoTaste = new Taste<Mango>();
        Mango mango = new Mango();        
        mangoTaste.tellTaste(mango);        
        Taste<Lemon> lemonTaste = new Taste<Lemon>();        
        Lemon lemon = new Lemon();        
        lemonTaste.tellTaste(lemon);
    }
}

interface Fruit<T>
	{
    	void tellTaste(T fruit);
	}

class Taste<T> implements Fruit<T>
	{
    	public void tellTaste(T fruit) 
    	{
            
    		String fruitName = fruit.getClass().getName();
            
    		if(fruitName.equals("Mango"))
    			{
    				System.out.println("Mango is sweet");
    			}
    		else if(fruitName.equals("Lemon"))
    			{
    			System.out.println("Lemon is sour");
    			}
    	}
    
	}
class Mango
{   
}
class Lemon
{
}