package knihovna;
import java.util.Scanner;
public class Publikace {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String autor;
    private int rok;
    private int isbn;
    private int pocetstranek;

    public Publikace() {
        System.out.println("zadej jmeno");
        this.name = scanner.nextLine();

        System.out.println("Zadej autora");
        this.autor = scanner.nextLine();

        System.out.println("zadej rok vydaní");
        this.rok = scanner.nextInt();
        scanner.nextLine();
        System.out.println("zadej ISBN");
        this.isbn = scanner.nextInt();
        scanner.nextLine();
        System.out.println("zadej pocet stranek");
        this.pocetstranek = scanner.nextInt();
        scanner.nextLine();
    }
    public void vypisInfo(){
        System.out.println(this.name);
        System.out.println(this.autor);
        System.out.println(this.rok);
        System.out.println(this.isbn);
        System.out.println(this.pocetstranek);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getRok() {
        return rok;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPocetstranek() {
        return pocetstranek;
    }
}
