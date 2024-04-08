package knihovna;


public class Roman extends Publikace {
    private String zanr;

    public Roman(String zanr) {
        super();
        this.zanr = zanr;
    }
    public void vypisInfo(){
        super.vypisInfo();
        System.out.println(this.zanr);
    }
}
