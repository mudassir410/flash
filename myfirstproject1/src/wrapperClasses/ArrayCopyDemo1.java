package wrapperClasses;

public class ArrayCopyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[] = {'J', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'};
        char arrayCopy[] = new char[4];
        System.arraycopy(array, 0, arrayCopy, 0, 3);
        System.out.println(new String(arrayCopy));    
	}

}
