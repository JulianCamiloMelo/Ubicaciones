package co.entrevista.bancobta.service;

import co.entrevista.bancobta.model.Location;
import java.util.List;
import javax.ejb.Local;

@Local
public interface LocationService {
    public List<Location> listarLocations();
    public Location buscarLocationPorId(Location location);
    public void registrarLocation(Location location);
    public void modificarLocation(Location location);
    public void borrarLocation(Location location);
}
