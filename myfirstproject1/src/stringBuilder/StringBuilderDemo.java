package stringBuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder = " + sb);
        sb.append(" World");
        System.out.println("After append = " + sb);    
        sb.insert(0, "Java ");
        System.out.print("After insertion = " + sb);
	}

}
