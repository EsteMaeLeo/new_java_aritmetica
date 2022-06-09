package operaciones;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Constructor Caja");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calculaVolumen() {
        return this.ancho * this.alto * this.profundo;
    }

}
