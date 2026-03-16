package assignments;
import java.util.ArrayList;
public class Assignment68 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("Paper");
		a1.add("Scale");
		a1.add("Eraser");
		System.out.println(a1);
		boolean b = a1.contains("Eraser");
		System.out.println(b);
		
		ArrayList<String> a2= new ArrayList<>();
		a2.add("Pen");
		a2.add("Pencil");
		a2.add("Paper");
		a2.add("Scale");
		a2.add("Eraser");
		boolean b2 = a2.containsAll(a1);
		System.out.println(b2);
	}
}
