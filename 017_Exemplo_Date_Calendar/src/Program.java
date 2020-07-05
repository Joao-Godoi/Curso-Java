import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Serve para criar o formato da data
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //Serve para criar uma data específica
		
		System.out.println(sdf.format(d)); 
		
		Calendar cal = Calendar.getInstance(); //Cria um calendário
		cal.setTime(d); //Instancia a data dentro do calendario
		cal.add(Calendar.HOUR_OF_DAY, 4); //Serve para adicionar o que vc quiser
		d = cal.getTime(); //Atualiza a data com o que foi adicionado
		
		System.out.println(sdf.format(d));
		
		int  minutes = cal.get(Calendar.MINUTE); //Cria uma variavel minutos, depois pega os minutos da hora que ta no calendar
		System.out.println("Minutos: " + minutes);
		
		int mes = 1 + cal.get(Calendar.MONTH); //Cria uma variavel mes, depois pega o mes que ta no calendar, o +1 é pq jan começa em 0
		System.out.println("Mes: " + mes);

	}

}
