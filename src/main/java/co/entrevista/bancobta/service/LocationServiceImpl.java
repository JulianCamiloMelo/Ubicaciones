package co.entrevista.bancobta.service;

import co.entrevista.bancobta.model.Location;
import co.entrevista.bancobta.persistence.LocationDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class LocationServiceImpl implements LocationService{
    @Inject
    LocationDao locationDao;
    @Override
    public List<Location> listarLocations() {
        return locationDao.findAllLocations();
    }
    
    @Override
    public Location buscarLocationPorId(Location location) {
        return locationDao.findLocationById(location);
    }

    @Override
    public void registrarLocation(Location location) {
        locationDao.insertLocation(location);
    }

    @Override
    public void modificarLocation(Location location) {
        locationDao.updateLocation(location);
    }

    @Override
    public void borrarLocation(Location location) {
        locationDao.deleteLocation(location);
    }
}
