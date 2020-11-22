package co.entrevista.bancobta.persistence;

import co.entrevista.bancobta.model.Location;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LocationDaoImpl implements LocationDao{
    
    @PersistenceContext (unitName = "bancosPU")
    private EntityManager manager;

    @Override
    public List<Location> findAllLocations() {
        return manager.createNamedQuery("Locations.findAll").getResultList();
    }

    @Override
    public Location findLocationById(Location location){
        return manager.find(Location.class, location);
    }

    @Override
    public void insertLocation(Location location) {
        manager.persist(location);
    }

    @Override
    public void updateLocation(Location location) {
        manager.merge(location);
    }

    @Override
    public void deleteLocation(Location location) {
        manager.remove(manager.merge(location));
    }    
}
