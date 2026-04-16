package com.edu.uce.negocio;

public class NotificadorWhatsapp {

    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia el mensaje de WhatsApp al numero " + telefono);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
