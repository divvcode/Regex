import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpnAssisted {

	public static void main(String[] args) {
		String re = "\\D";
		String text = "g";
		
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(text);
		
		boolean result = mt.matches();
		System.out.println(result);
		
		 
		// TODO Auto-generated method stub

	}

}
