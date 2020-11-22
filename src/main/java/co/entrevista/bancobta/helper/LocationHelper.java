package co.entrevista.bancobta.helper;

import co.entrevista.bancobta.model.Location;
import co.entrevista.bancobta.service.LocationService;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class LocationHelper {
    
    @Inject
    private LocationService locationService;
    
    public List<Location> getLocations(){
        List<Location> locations = new ArrayList();
        locations = locationService.listarLocations();
        return locations;
    }
    
    public Location buscarLocationPorId(int id){
        Location location = new Location();
        List<Location> locations = getLocations();
        for(Location loc:locations){
            if(loc.getIdLocation().equals(id)){
                location = loc;
            }
        }
        return location;
    }
    
}

