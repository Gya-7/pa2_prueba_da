
import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Dayerlin Aguilar",
                "Coca Cola", 1200, "dgdac.7@gmail.com");

        PedidoService service = new PedidoService();
        service.registrar(pedido);

    }


}
