package knihovna;


public class Ucebnice extends Publikace {
    private String predmet;

    public Ucebnice(String predmet) {
        super();
        this.predmet = predmet;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println(this.predmet);
    }
}
