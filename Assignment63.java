package assignments;
import java.util.ArrayList;
public class Assignment63 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("Paper");
		a1.add("Scale");
		a1.add("Eraser");
		System.out.println("List of Stationery items: " +a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Crayons");
		a2.add("Scetchpen");
		a2.add("Books");
		
		a1.addAll(a2);
		System.out.println("Updated List: "+a1);
	}
}
