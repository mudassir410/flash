package stringBuffer;

public class StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a1 = new StringBuffer("abc");
        StringBuffer a2 = new StringBuffer("def");
        System.out.println("Appending another StringBuffer- "+ a1.append(a2));
        String a3 = "ghi";
        System.out.println("Appending a String- "+ a1.append(a3));
        char c1[] = {'j','k','l'};
        System.out.println("Appending a  character array- "+ a1.append(c1));
        System.out.println("Appending part of a character array- "+ a1.append(c1,0,2));
        System.out.println("Appending a boolean- "+ a1.append(true));
        System.out.println("Appending a character- "+ a1.append('Z'));
        System.out.println("Appending an integer- "+ a1.append(1));
        System.out.println("Appending a double- "+ a1.append(2.35));
        StringBufferAppend sba = new StringBufferAppend();
        //StringBufferAppend sba = null;//trying to append null
        System.out.println("Appending an object- "+ a1.append(sba));
	}

}
