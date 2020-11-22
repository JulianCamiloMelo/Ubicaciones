package co.entrevista.bancobta.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "location")
@NamedQueries({
    @NamedQuery(name = "Locations.findAll", query = "SELECT l FROM Location l ORDER BY l.idLocation")
})
public class Location implements Serializable{
    public static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "IDLOCATION")
    private Integer idLocation;
    @Column(name = "NAME")  
    private String name;
    @Column(name = "AREA_M2")  
    private int area_m2;

    public Location() {
    }

    public Location(Integer idLocation, String name, int area_m2) {
        this.idLocation = idLocation;
        this.name = name;
        this.area_m2 = area_m2;
    }

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea_m2() {
        return area_m2;
    }

    public void setArea_m2(int area_m2) {
        this.area_m2 = area_m2;
    }

    @Override
    public String toString() {
        return "Location{" + "idLocation=" + idLocation + ", name=" + name + ", area_m2=" + area_m2 + '}';
    }
    
}