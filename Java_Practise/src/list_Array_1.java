import java.util.ArrayList;
import java.util.Scanner;

public class list_Array_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		String input = scan.next();
		scan.close();
		arrayList.add(input);
		System.out.println(arrayList);
		
	}

}
