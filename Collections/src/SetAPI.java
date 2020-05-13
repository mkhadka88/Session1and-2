import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		HashSet<String> emailSet = new HashSet<String>();
		emailSet.add("mk@hotmail.com");
		emailSet.add("sk@hotmail.com");
		emailSet.add("rk@hotmail.com");
		emailSet.add("gk@hotmail.com");
		emailSet.add("mk@hotmail.com");
		emailSet.add("bk@hotmail.com");
   System.out.println(emailSet);
   
   Iterator<String> iRef =emailSet.iterator();
   while (iRef.hasNext()) {
	   String e = iRef.next();
	   System.out.println(e);
	   
	   TreeSet<String> set = new TreeSet<String>(emailSet);
	   
	   System.out.println(set);
	   System.out.println(emailSet.size());
	   System.out.println(emailSet.contains("gk@hotmail.com"));
	   
   }
	}

}

