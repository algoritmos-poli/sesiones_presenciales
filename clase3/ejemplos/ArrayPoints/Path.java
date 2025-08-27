public class Path {
    // Atributos
    private Point[] points;
    private int n; // Numero de puntos a registrar (se puede poner como final)
    private int actualIndex; // Cantidad de puntos registrados

    public Path() {
        this.n = 2;
        this.actualIndex = 0;
        this.points = new Point[n];
    }

    public Path(int n) {
        this.n = n;
        this.actualIndex = 0;
        this.points = new Point[n];
    }

    public Path(Point[] points) {
        this.actualIndex = 0;
        this.n = points.length;
        this.points = new Point[this.n];
        for(int i = 0; i < this.n; i++) {
            // this.points[i].setX(points[i].getX());  // ERROR
            // this.points[i].setY(points[i].getY());  // ERROR
            this.points[i] = new Point(points[i]);
            this.actualIndex++;
        }
    }

    public int getAvailableCoords() {
        return n - actualIndex;
    }

    public Point[] getCoords() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void addCoord(double x, double y) {
        if(actualIndex >= n) {
            // Ruta llena
            System.out.println("La capacidad maxima de puntos se ha superado");
        }
        else {
            points[actualIndex] = new Point(x,y);
            System.out.println("Coordenada " + points[actualIndex] + " agregada a la ruta");
            actualIndex++;
        }
    }

    public void setCoord(int index, double x, double y) {
        if(index < 0 | index > n) {
            System.out.println("ERROR: indice invalido");
        }
        else {
            Point oldCoord = new Point(points[index]);
            points[index].setX(x);
            points[index].setY(y);
            System.out.println("Coordenada " + index + " cambiada: " + oldCoord + " -> " + points[index]);
        }
    }

    public double getTotalDistance() {
        double totalDistance = 0;
        double distance;
        for(int i = 0; i < actualIndex - 1; i++) {
            distance = points[i + 1].distanceTo(points[i]);
            totalDistance += distance;
        }
        return totalDistance;
    }

    public void printPath() {
        System.out.println("Puntos registrados en la ruta: ");
        for(int i = 0; i < actualIndex; i++) {
            System.out.println("-> " + points[i]);
        }
        System.out.println("Registros disponibles: " + (n - actualIndex));
    }
}


