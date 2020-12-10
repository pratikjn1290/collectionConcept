package collectionsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> alss = Collections.synchronizedList(new ArrayList<String>());
		alss.add("Raj");
		alss.add("Guj");
		alss.add("Hiee");
		alss.add("Hello");
		alss.add("How");
	
		//for add/remove no explicit sync not required and in fetch required
		
		synchronized (alss) {
			
			Iterator<String> itr =  alss.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		//for add/remove/fetch When we are using CopyonWrite method no explicit synchronization required
		
		System.out.println("------------------------CopyonWriteArrayList------------------------");
		CopyOnWriteArrayList<String> ass = new CopyOnWriteArrayList<String>(alss);
		Iterator<String> itr2 = ass.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	
		
		

	}

}
