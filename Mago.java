package Ejercicio3;

public class Mago extends Personaje {
    private String magia;
    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }
    public String getMagia() {
        return magia;
    }
    public void setMagia(String magia) {
        this.magia = magia;
    }
    @Override
    public void entrenar() {
        System.out.println("El mago es vago y no entrena, su salud sigue siendo: " + getSalud());
    }

    public void mostrarEstado() {
        System.out.println("Mago - Salud: " + salud + ", Magia: " + magia);
    }
}

