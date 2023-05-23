import com.domain.Order;
import com.domain.Status;
import com.processor.OrderProcessor;

public class ApplicationLuncher {

	
	public static void main(String[] args) {
		Order anOrder = new Order(true, 200, "firstOrder", Status.PENDING);
		OrderProcessor.processOrder(anOrder);
		anOrder = new Order(true, 10, "second order", Status.PENDING);
		OrderProcessor.processOrder(anOrder);
	}
}
