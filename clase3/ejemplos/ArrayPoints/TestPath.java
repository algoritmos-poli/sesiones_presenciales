public class TestPath {
    public static void main(String[] args) {
        Path ruta1 = new Path(4);
        ruta1.addCoord(0,0);
        ruta1.addCoord(1,1);
        ruta1.addCoord(4,4);
        ruta1.addCoord(4,5);
        ruta1.addCoord(6,5);
        ruta1.printPath();
        double distRuta1 = ruta1.getTotalDistance();
        System.out.println("Distancia total ruta 1: " + distRuta1);
        Point [] pointsRuta = ruta1.getCoords();
        Path ruta2 = new Path(pointsRuta);
        ruta2.printPath();
        ruta2.setCoord(0,2.5,-1.5);
        ruta2.printPath();
        System.out.println("Fin");
    }
}
