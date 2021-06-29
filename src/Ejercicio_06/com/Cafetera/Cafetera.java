package Ejercicio_06.com.Cafetera;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera(){
        setCapacidadActual(getCapacidadMaxima());
    }

    public void servirTaza(int capacidadTaza){
        boolean alcanzaElCafe = capacidadTaza < getCapacidadActual();
        if(!alcanzaElCafe){
            System.out.println("No hay suficiente cafe para llenar la taza, colocando el restante.");
        }else{
            System.out.println("Se sirvió una taza completa");
        }
        setCapacidadActual(alcanzaElCafe? getCapacidadActual()-capacidadTaza : 0);
    }

    public void vaciarCafetera(){
        setCapacidadActual(0);
    }

    public void agregarCafe(int cantidadCafe){
        boolean llenaLaJarra = cantidadCafe+getCapacidadActual() > getCapacidadMaxima();
        if(llenaLaJarra){
            System.out.println("La cantidad rebalsa la cafetera, llenandola y parando");
            llenarCafetera();
        }else {
            setCapacidadActual(cantidadCafe+getCapacidadActual());
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}
