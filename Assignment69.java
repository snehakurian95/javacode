package assignments;
import java.util.ArrayList;
public class Assignment69 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("Paper");
		a1.add("Scale");
		a1.add("Eraser");
		System.out.println("List:" +a1);
		a1.remove("Pencil");
		System.out.println("Remove an element: " +a1);
		a1.remove(2);
		System.out.println("Remove with indexing: " +a1);
		
		ArrayList<String> a2= new ArrayList<>();
		a2.add("Crayons");
		a2.add("Scetchpen");
		a2.add("Books");
		a2.addAll(a1);
		System.out.println("Add a1 in a2: " +a2);
		a2.removeAll(a1);
		System.out.println("Remove all from a2: " +a2);
	}

}
