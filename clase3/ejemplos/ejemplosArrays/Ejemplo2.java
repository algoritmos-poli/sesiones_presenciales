import java.util.Arrays;
public class Ejemplo2 {
    public static void main(String[] args) {
        String[] lenguajesP = {"Java", "C++", "Python"};
        // A la antigua
        for(String e: lenguajesP) {
            System.out.println(e);
        }
        System.out.println();
        for(int i = 0; i < lenguajesP.length; i++) {
            System.out.println(lenguajesP[i]);
        }
        System.out.println();
        // Imprime el array usando el método toString()
        System.out.println(" Lenguajes de programacion : " + Arrays.toString(lenguajesP));


        String[] lenguajesPOrdenado;
        lenguajesPOrdenado = Arrays.copyOf(lenguajesP,lenguajesP.length);
        Arrays.sort(lenguajesPOrdenado);

        System.out.println(" Lenguajes de programacion (ordenado): " + Arrays.toString(lenguajesPOrdenado));
    }
}
