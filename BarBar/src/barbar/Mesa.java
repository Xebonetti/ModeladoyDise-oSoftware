/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbar;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private boolean ocupada;
    private List<Pedido> pedidos;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.pedidos = new ArrayList<>();
    }

    public void asignarCliente() {
        this.ocupada = true;
    }

    public void liberar() {
        this.ocupada = false;
        this.pedidos.clear();
    }

    public void agregarPedido(Pedido pedido) {
        if (this.ocupada) {
            this.pedidos.add(pedido);
        } else {
            System.out.println("Mesa no ocupada, no se puede agregar pedido.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public int getNumero() {
        return numero;
    }
}