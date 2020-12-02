package catchau;

public class Promocao {

    private String cupom;

    public enum Cupom {

        CUPOM1("CUPOM1");
        private final String cupom;

        Cupom(String cupom) {
            this.cupom = cupom;
        }

        String getCupom() {
            return this.cupom;
        }
    }

    public String getCupom() {
        return this.cupom;
    }
}
