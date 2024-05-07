package com.jardineria67000609.ModuloA.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.Jardineria.ModuloA.Entity.Proveedores;
import com.example.Jardineria.ModuloA.Entity.Departamento;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Ciudad {
    @Id
    private String codigoPostal;
    private String nombreCiudad;



    @OneToMany(mappedBy = "ciudad", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("ciudad")
    private List<Proveedores> proveedores;

    @ManyToOne
    @JoinColumn(name="Codigo_Departamento")
    @JsonIgnoreProperties("departamento")
    private Departamento departamento;

}
