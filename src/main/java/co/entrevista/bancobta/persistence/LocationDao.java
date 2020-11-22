package co.entrevista.bancobta.persistence;

import co.entrevista.bancobta.model.Location;
import java.util.List;

public interface LocationDao{
    public List<Location> findAllLocations();
    public Location findLocationById(Location location);
    public void insertLocation(Location location);
    public void updateLocation(Location location);
    public void deleteLocation(Location location);
}
