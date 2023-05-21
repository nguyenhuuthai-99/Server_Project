package com.mycompany.assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author thainguyen
 */
@Entity
@Table(name = "fire")
@NamedQueries({
        @NamedQuery(name = "Fire.findAll", query = "SELECT f FROM Fire f"),
        @NamedQuery(name = "Fire.findById", query = "SELECT f FROM Fire f WHERE f.id = :id"),
        @NamedQuery(name = "Fire.findByIsActive", query = "SELECT f FROM Fire f WHERE f.isActive = :isActive"),
        @NamedQuery(name = "Fire.findByIntensity", query = "SELECT f FROM Fire f WHERE f.intensity = :intensity"),
        @NamedQuery(name = "Fire.findByBurningAreaRadius", query = "SELECT f FROM Fire f WHERE f.burningAreaRadius = :burningAreaRadius"),
        @NamedQuery(name = "Fire.findByXpos", query = "SELECT f FROM Fire f WHERE f.xpos = :xpos"),
        @NamedQuery(name = "Fire.findByYpos", query = "SELECT f FROM Fire f WHERE f.ypos = :ypos")})
public class Fire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isActive")
    private int isActive;
    @Column(name = "intensity")
    private Integer intensity;
    @Column(name = "burningAreaRadius")
    private Long burningAreaRadius;
    @Column(name = "xpos")
    private Integer xpos;
    @Column(name = "ypos")
    private Integer ypos;

    public Fire() {
    }

    public Fire(Integer id) {
        this.id = id;
    }

    public Fire(Integer id, int isActive) {
        this.id = id;
        this.isActive = isActive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }

    public Long getBurningAreaRadius() {
        return burningAreaRadius;
    }

    public void setBurningAreaRadius(Long burningAreaRadius) {
        this.burningAreaRadius = burningAreaRadius;
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
               "Fire ID: " + id + "\n" +
               "X Position: " + x_pos + "\n" +
               "Y Position: " + y_pos + "\n" +
               "Drone Reporting: " + droneId + "\n" +
               "Severity: " + severity + "\n";
    }
}
