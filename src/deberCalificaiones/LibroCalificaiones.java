package deberCalificaiones;

public class LibroCalificaiones {

    private int contador=3;
    private String nombreMateria;
    private double[][] ingresoNotas;

    public LibroCalificaiones(int contador, String nombreMateria, double[][] ingresoNotas) {
        this.contador = contador;
        this.nombreMateria = nombreMateria;
        this.ingresoNotas = ingresoNotas;
    }
    
    

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double[][] getIngresoNotas() {
        return ingresoNotas;
    }

    public void setIngresoNotas(double[][] ingresoNotas) {
        this.ingresoNotas = ingresoNotas;
    }

    public double[][] ingresoNotas() {
        double matriz[][] = new double[contador][contador];

        double examen1 = 0, examen2 = 0, examen3 = 0;
        if (examen1 < 20) {
            matriz[0][1] = examen1;
        }
        if (examen2 < 20) {
            matriz[0][2] = examen2;
        }
        if (examen3 < 20) {
            matriz[0][2] = examen3;
        }
       /* matriz[0][1] = nota1;
        matriz[0][2] = nota2;
        matriz[0][3] = nota3;*/
       ingresoNotas[0][1]=matriz[0][1];
       ingresoNotas[0][2]=matriz[0][2];
       ingresoNotas[0][3]=matriz[0][3];

        return ingresoNotas;
    }

    public String toString() {

        return "Examen 1 " +ingresoNotas[0][1]+
               "Examen 2 " +ingresoNotas[0][2]+
               "Examen 3 " +ingresoNotas[0][3];
    }

}
