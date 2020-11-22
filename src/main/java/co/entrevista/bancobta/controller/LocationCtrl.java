package co.entrevista.bancobta.controller;

import co.entrevista.bancobta.model.Location;
import co.entrevista.bancobta.service.LocationService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

@Named
@RequestScoped
public class LocationCtrl{
    @Inject
    private LocationService locationService;
    
    private Location location;
    private List<Location> locations;

    public LocationCtrl() {
    }
    
    @PostConstruct
    public void inicializar(){
        locations = locationService.listarLocations();
        location = new Location();
    }
    
    public String Listar(){
        return "listarLocation";
    }
    
    public String crear(){
        location = new Location();
        return "crearLocation";
    }
    
    public String insertar(){
        locationService.registrarLocation(location);
        locations.add(location);
        return "listarLocation";
    }
    
    public String editar(Location location){
        this.location = location;
        return "editarLocation";
    }
    
    public String actualizar(){
        locationService.modificarLocation(location);
        locations = locationService.listarLocations();
        return "listarLocation";
    }
    public String eliminar(Location location){
        locationService.borrarLocation(location);
        locations = locationService.listarLocations();
        return "listarLocation";
    }
    
    public void reiniciarLocation(){
        location = new Location();
    }
    
    public void editListener(RowEditEvent event){
        location = (Location)event.getObject();
        locationService.modificarLocation(location);
    }
    
    public void agregarLocation(){
        this.locationService.registrarLocation(location);
        this.locations.add(location);
        this.location=null;
    }
    
    public void eliminarLocation(){
        this.locationService.borrarLocation(location);
        this.locations.remove(location);
        this.location=null;
    }
    
    public Location getLocation(){
        return location;
    }
    
    public void setLocation(Location location){
        this.location = location;
    }
    
    public List<Location> getLocations(){
        return locations;
    }
    
    public void setLocations(List<Location> locations){
        this.locations = locations;    
    }
}