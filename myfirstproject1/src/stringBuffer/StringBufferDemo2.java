package stringBuffer;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");
        System.out.println("Buffer = " + sb);
        System.out.println("Old Capacity = " + sb.capacity());    
        sb.ensureCapacity(19);
        System.out.println("New Capacity1 = " + sb.capacity());
        sb.ensureCapacity(21);
        System.out.println("New Capacity2 = " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("New Capacity3 = " + sb.capacity());
	}

}
