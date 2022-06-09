package operaciones;

public class Aritmetica {

    //atributos
    int a;
    int b;

    //constructor
    public Aritmetica() {
        System.out.println("Ejecutando...");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor argumentos");
    }
    //metodo

    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        //int resultado = a + b;
        //return resultado;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }

}
