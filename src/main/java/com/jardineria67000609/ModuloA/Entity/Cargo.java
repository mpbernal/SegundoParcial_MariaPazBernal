package com.jardineria67000609.ModuloA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity

public class Cargo {
    @Id


    private String codigoCargo;
    private String nombreCargo;
    private String nivelSeguridad;

}
