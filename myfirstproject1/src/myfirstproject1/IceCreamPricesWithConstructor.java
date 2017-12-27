package myfirstproject1;

public class IceCreamPricesWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream ic =new IceCream("Pista",2);
        System.out.println(ic.NumberOfScoops +" scoops of "+ ic.flavor +" flavor price is : "+ ic.getPrice());
        
        FruitSaladWithIceCream fs =new FruitSaladWithIceCream("Chocolate",1,50);
        
        System.out.print(fs.GramsOfFruitSalad +" grams of fruit salad and ");
        System.out.println(fs.NumberOfScoops +" scoops of "+ fs.flavor +" flavor price is : "+ fs.getPrice());
        
        KhubaniKaMeetaWithIceCream kkm =new KhubaniKaMeetaWithIceCream("Vanila",1,75);
        
        System.out.print(kkm.GramsOfKhubaniKaMeeta +" grams of khubani ka meeta and ");
        System.out.println(kkm.NumberOfScoops +" scoops of "+ kkm.flavor +" flavor price is : "+ kkm.getPrice());
    
    }
}

class IceCream
{
	String flavor;
	int NumberOfScoops;
	
	IceCream(String flavor,int NumberOfScoops)
	{
		this.flavor=flavor;
		this.NumberOfScoops=NumberOfScoops;
	}
	double getPrice()
	{
		double PricePerScoop=35.0;
		return NumberOfScoops*PricePerScoop;
	}
}
class FruitSaladWithIceCream extends IceCream
{
	int GramsOfFruitSalad;
	
	FruitSaladWithIceCream(String flavor,int NumberOfScoops,int GramsOfFruitSalad)
	{
		super(flavor,NumberOfScoops);
		this.GramsOfFruitSalad=GramsOfFruitSalad;
	}
	double getPrice()
	{
		double IceCreamPrice=super.getPrice();
		double pricePerGram=0.75;
		
		return GramsOfFruitSalad*pricePerGram+IceCreamPrice;
	}
}
class KhubaniKaMeetaWithIceCream extends IceCream
{
    int GramsOfKhubaniKaMeeta;

    KhubaniKaMeetaWithIceCream(String flavor,int NumberOfScoops,int GramsOfKhubaniKaMeeta)
    {
        super(flavor,NumberOfScoops);
        this.GramsOfKhubaniKaMeeta = GramsOfKhubaniKaMeeta;
    }
    double getPrice()
    {
    	double IceCreamPrice=super.getPrice();
    	double PricePerGram=1.25;
    	
    	return GramsOfKhubaniKaMeeta*PricePerGram+IceCreamPrice;
    }
}