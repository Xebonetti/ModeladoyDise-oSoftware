/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbar;

public class Personal {
    protected String nombre;
    protected String rol;

    public Personal(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }
}

public class Mozo extends Personal {

    public Mozo(String nombre) {
        super(nombre, "Mozo");
    }

    public void asignarMesa(Mesa mesa) {
        if (!mesa.isOcupada()) {
            mesa.asignarCliente();
        } else {
            System.out.println("La mesa " + mesa.getNumero() + " ya está ocupada.");
        }
    }
}

