package com.jardineria67000609.ModuloA.Entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity

public class EstadoPago {

    @Id

    private String codigoEstadoPago;
    private String nombreEstadoPago;
}


