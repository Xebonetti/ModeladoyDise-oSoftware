/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barbar;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public void realizarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}