package javaGenerics;

public class GenericsErasureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsErasure<Integer> integerObject = new GenericsErasure<Integer>(12);        
        System.out.println("Integer Object : " + integerObject.getClass().getName());        
        GenericsErasure<Float> floatObject = new GenericsErasure<Float>(23.0F);        
        System.out.println("Float Object : " + floatObject.getClass().getName());
        GenericsErasure<Double> doubleObject = new GenericsErasure<Double>(50.55);        
        System.out.println("Double Object : " + doubleObject.getClass().getName());
    
    }
}

class GenericsErasure<T> 
{
    T obj;
    GenericsErasure(T obj)
    {
        this.obj =obj;
	}

}
