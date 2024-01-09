import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iterators {

	public static void main(String[] args) {

	ArrayList l=new ArrayList();
	l.add(1);
	l.add(20.3);
	l.add("son");
	l.add(true);
	Iterator ab = l.iterator();
	while(ab.hasNext())
	{
		System.out.println(ab.next());
	}

	}

}
