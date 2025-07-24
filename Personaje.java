
public abstract class Personaje {
    protected int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public abstract void entrenar();

    public abstract void mostrarEstado();
}
