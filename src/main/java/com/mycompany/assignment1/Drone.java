package com.mycompany.assignment1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author thainguyen
 */
@Entity
@Table(name = "drone")
@NamedQueries({
        @NamedQuery(name = "Drone.findAll", query = "SELECT d FROM Drone d"),
        @NamedQuery(name = "Drone.findById", query = "SELECT d FROM Drone d WHERE d.id = :id"),
        @NamedQuery(name = "Drone.findByName", query = "SELECT d FROM Drone d WHERE d.name = :name"),
        @NamedQuery(name = "Drone.findByXpos", query = "SELECT d FROM Drone d WHERE d.xpos = :xpos"),
        @NamedQuery(name = "Drone.findByYpos", query = "SELECT d FROM Drone d WHERE d.ypos = :ypos")})
public class Drone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "xpos")
    private Integer xpos;
    @Column(name = "ypos")
    private Integer ypos;

    public Drone() {
    }

    public Drone(Integer id) {
        this.id = id;
    }

    public Drone(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXpos() {
        return xpos;
    }

    public void setXpos(Integer xpos) {
        this.xpos = xpos;
    }

    public Integer getYpos() {
        return ypos;
    }

    public void setYpos(Integer ypos) {
        this.ypos = ypos;
    }
    // toString() Method
    @Override
    public String toString() {
        return 
               "ID: " + id + "\n" +
               "Name: " + name + "\n" +
               "X Position: " + x_pos + "\n" +
               "Y Position: " + y_pos + "\n";
    }
}
