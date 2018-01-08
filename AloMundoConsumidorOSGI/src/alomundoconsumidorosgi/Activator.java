package alomundoconsumidorosgi;

import com.acme.servicoosgi.AloMundoService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference<?> aloMundoReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Inicio dos tempos do consumidor");
		aloMundoReference = context.getServiceReference(AloMundoService.class.getName());
		AloMundoService aloService = (AloMundoService) context.getService(aloMundoReference);

		System.out.println(aloService.falaOi());
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fim dos tempos do consumidor");
		context.ungetService(aloMundoReference);
	}

}
