package co.entrevista.bancobta.locationtest;

import co.entrevista.bancobta.controller.LocationCtrl;
import co.entrevista.bancobta.model.Location;
import co.entrevista.bancobta.service.LocationService;
import java.util.List;
import static junit.framework.Assert.assertNotNull;
import junit.framework.TestCase;
/**
 *
 * @author Julian Camilo Melo
 */
public class LocationTest extends TestCase{
    private LocationCtrl locationCtrl; 
    private LocationService locationService;
    private Location location;
    
    public void escenario1(){
        locationCtrl = new LocationCtrl();
    }
    
    /**
     * Prueba 1: Método que se encarga de verificar el método crear.<br>
     * <b> Métodos a probar: </b> <br>
     * crear<br>
     * <b> Casos de prueba: </b> <br>
     * 1. La Ubicación fue creada satisfactoriamente.
     */
    public void testCrearLocation(){
        escenario1();
        assertNotNull("Error presentado cuando se va a crear una Ubicacion",locationCtrl.crear());
    }
    
    public void testEliminarLocation(){
        escenario1();
        location = new Location(3,"Colombia",2500);
        assertNotNull("Error presentado cuando se va a eliminar una ubicacion",locationCtrl.eliminar(location));
    }
    
}
