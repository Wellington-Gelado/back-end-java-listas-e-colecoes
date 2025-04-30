import java.util.ArrayList;

public class MainFormasGeometricas {
    public static void main(String[] args) {

        ArrayList<FormaGeometrica> listaGeometrica = new ArrayList<>();

        Quadrado quadrado1 = new Quadrado(1);
        Quadrado quadrado2 = new Quadrado(2);

        Circulo circulo1 = new Circulo(1);
        Circulo circulo2 = new Circulo(2);

        listaGeometrica.add(quadrado1);
        listaGeometrica.add(quadrado2);
        listaGeometrica.add(circulo1);
        listaGeometrica.add(circulo2);


        System.out.println("Área das formas - Tradicional");
        for(FormaGeometrica forma : listaGeometrica){
            System.out.println(forma.toString() + " => Área = " + forma.calcularArea());
        }



        // **Abordagem com Stream: Calculando e imprimindo as áreas**
        System.out.println("Área das formas (abordagem com Stream):");
        listaGeometrica.stream()
                       .map(forma -> forma.toString() + " => Área = " + forma.calcularArea())
                       .forEach(System.out::println);
    }
}

