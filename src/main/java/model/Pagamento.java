package model;

import java.util.Date;

public class Pagamento {


        private Date date;
        private float valor;
        private long id;

        @Override
        public String toString() {
            return "Pagamentos{" +
                    "date=" + date +
                    ", valor=" + valor +
                    ", id=" + id +
                    '}';
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }

