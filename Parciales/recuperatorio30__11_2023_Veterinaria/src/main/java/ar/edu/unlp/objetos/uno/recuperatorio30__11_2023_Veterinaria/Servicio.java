package ar.edu.unlp.objetos.uno.recuperatorio30__11_2023_Veterinaria;

public class Servicio {

}
public abstract class Servicio {
    private Mascota mascota;
    private LocalDate fecha;

    public Servicio(Mascota mascota) {
        this.mascota = mascota;
        this.fecha = LocalDate.now();
    }

    public Mascota getMascota() {
        return mascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public abstract double calcularCosto();
}
