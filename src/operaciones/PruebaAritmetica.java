package operaciones;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(654, 889);
        System.out.println("resultado usando argumentos = " + resultado);
        
        Aritmetica art1 = new Aritmetica();
        System.out.println("a = " + art1.a);
        System.out.println("b = " + art1.b);
        
        Aritmetica art2 = new Aritmetica(5, 97);
        System.out.println("a = " + art2.a);
        System.out.println("b = " + art2.b);
        
        Caja c1 = new Caja();
        c1.ancho = 3;
        c1.alto = 2;
        c1.profundo = 6;
        int volumen = c1.calculaVolumen();
        System.out.println("volumen = " + volumen);
        
        Caja c2 = new Caja(5, 25, 50);
        int volumen2 = c2.calculaVolumen();
        System.out.println("volumen2 = " + volumen2);
    }
}
