
public class Assignment3_3main {

	public static void main(String[] args) {

		Assignment3_3 list = new Assignment3_3();
		
		list.addPosition(10, 1);
		list.addPosition(20, 2);
		list.addPosition(30, 3);
		
		list.display();
		
		list.deletePosition(2);
		
		list.display();
		
	}

}
