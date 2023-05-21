package com.mycompany.assignment1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "firetrucks")
@NamedQueries({
        @NamedQuery(name = "Firetrucks.findAll", query = "SELECT f FROM Firetrucks f"),
        @NamedQuery(name = "Firetrucks.findById", query = "SELECT f FROM Firetrucks f WHERE f.id = :id"),
        @NamedQuery(name = "Firetrucks.findByName", query = "SELECT f FROM Firetrucks f WHERE f.name = :name"),
        @NamedQuery(name = "Firetrucks.findByDesignatedFireId", query = "SELECT f FROM Firetrucks f WHERE f.designatedFireId = :designatedFireId")})
public class Firetrucks implements Serializable {

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
    @Column(name = "designatedFireId")
    private Integer designatedFireId;

    public Firetrucks() {
    }

    public Firetrucks(Integer id) {
        this.id = id;
    }

    public Firetrucks(Integer id, String name) {
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

    public Integer getDesignatedFireId() {
        return designatedFireId;
    }

    public void setDesignatedFireId(Integer designatedFireId) {
        this.designatedFireId = designatedFireId;
    }
}
