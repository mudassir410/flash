package string;

public class RegionCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruit = "apple";
        boolean result = fruit.regionMatches(0, "pineapple", 4, 5);
        System.out.println("apple regionMatches pineapple -- " + result);
        boolean result1 = fruit.regionMatches(0, "pineapple", 0, 4);
        System.out.println("apple regionMatches pineapple -- " + result1);
        boolean result2 = fruit.regionMatches(0, "pineAPPLE", 4, 5);
        System.out.println("apple regionMatches pineAPPLE -- " + result2);
        boolean result3 = fruit.regionMatches(false, 0, "pineAPPLE", 4, 5);
        System.out.println("apple regionMatches pineAPPLE -- " + result3);
        boolean result4 = fruit.regionMatches(true, 0, "pineAPPLE", 4, 5);
        System.out.println("apple regionMatches pineAPPLE -- " + result4);
        boolean result5 = "hello".regionMatches(3, "lol", 0, 3);
        System.out.println("hello regionMatches lol -- " + result5);
        boolean result6 = "hello".regionMatches(3, "lol", 0, 2);
        System.out.println("hello regionMatches lol -- " + result6);
	}

}
