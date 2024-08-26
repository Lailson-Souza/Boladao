import model.Pagamento;

import java.util.Date;

public class main {

        public static void main (String [] args){
            Pagamento pg =new Pagamento();
            pg.setId(11);
            pg.setValor(500);
            pg.setDate(new Date());
            System.out.println(pg);
        }
}
