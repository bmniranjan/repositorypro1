import java.util.ArrayList;
import java.util.ListIterator;

public class iterator1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);
		l.add(20.3);
		l.add("son");
		l.add(true);
		ListIterator ab = l.listIterator();
		while(ab.hasNext())
		{
			System.out.println(ab.next());
		}
		while(ab.hasPrevious())
		{
			Object p = ab.previous();
			System.out.println(p);
		}


	}

}
