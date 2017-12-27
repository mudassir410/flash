package wrapperClasses;

public class IsInfiniteandisNanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d1 = new Double(2.0 / 0.0);
        Double d2 = new Double(0.0/0.0);
        System.out.println(d1 + ": " + d1.isInfinite());
        System.out.println(d2 + ": " + d2.isNaN());
	}

}
