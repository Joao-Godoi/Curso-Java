import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Date y1 = sdf1.parse("25/06/2020");
		Date y2 = sdf2.parse("25/06/2020 16:15:30");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));

	}

}
