package stringBuffer;

public class StringBufferDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff = new StringBuffer("");
		System.out.println("empty capacity = " + buff.capacity());
        System.out.println("empty length = " + buff.length());
        buff = new StringBuffer("Java");
        System.out.println("Java capacity = " + buff.capacity());    
        System.out.println("Java length = " + buff.length());
        StringBuffer sb = new StringBuffer(6);
        System.out.println("Initial capacity : " + sb.capacity());
        sb.append("Merit Campus");
        System.out.println("Lenght of sb : " + sb.length());
        System.out.println("StringBuffer capacity : " + sb.capacity());
        StringBuffer sb1 = new StringBuffer(4);
        System.out.println("Intial capacity : " + sb1.capacity());
        sb.append("Merit Campus");
        System.out.println("Length of sb : " + sb.length());
        System.out.println("StringBuffer capacity : " + sb.capacity());

	}

}
