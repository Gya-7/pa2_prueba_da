package com.edu.uce.negocio;

public class PedidoService {

    public void registrar(Pedido pedido) {

        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        if (pedido.getTotal() > 100) {
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");

        } else {
            NotificadorSms ns = new NotificadorSms();
            ns.enviar(pedido.getTelefono(), "Se ha creado un pedido para ser atendido");
        }

    }

}
