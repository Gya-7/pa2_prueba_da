package com.edu.uce.negocio;

public class NotificadorSms {

    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia el mensaje al numero " + telefono);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
