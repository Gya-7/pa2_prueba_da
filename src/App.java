
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Dayerlin Aguilar",
                "Coca Cola", 1200, "dgdac.7@gmail.com", "099999999");

        Pedido pedido2 = new Pedido("Dayerlin Aguilar",
                "Coca", 100, "dgdac.7@gmail.com", "099999999");

        PedidoService service = new PedidoService();
        service.registrar(pedido);
        System.out.println("\n");
        service.registrar(pedido2);

    }


}
