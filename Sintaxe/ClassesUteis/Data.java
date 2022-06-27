import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
public class Data {
    public static void main(String args[]) {
        //  Sintaxe:    LocalDate nome = Localdate.now()            // para criar o objeto
        LocalDate data = LocalDate.now();         
        LocalTime horario = LocalTime.now();
        LocalDateTime DataeHorario = LocalDateTime.now();  
        System.out.println(data);
        System.out.println(horario);
        System.out.println(DataeHorario);   
        /*
            Valores possíveis argumentos:

                yyyy-MM-dd	"1988-09-29"	

                dd/MM/yyyy	"29/09/1988"

                dd-MMM-yyyy	"29-Sep-1988"	

                E, MMM dd yyyy	"Thu, Sep 29 1988" 
        */
        
        // Sintaxe de criação: DateTimeFormatter nome = DateTimeFormatter.ofPattern(argumento);
        DateTimeFormatter TempoFormatado = DateTimeFormatter.ofPattern("E, MMM dd yyyy");   
        // formatar a data requerida com o Objeto de formatação
        String DataFormatada = DataeHorario.format(TempoFormatado); 
        System.out.println(DataFormatada);
    }
}
