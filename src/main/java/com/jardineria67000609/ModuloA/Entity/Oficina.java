package com.example.Jardineria.ModuloA.Entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
@Data
@Entity
public class Oficina {
    @Id

    private String codigoOficina;
    private String ciudad;
    private String codigoPostal;
    private String telefono;
    private String LineaDireccion1;
    private String lineaDireccion2;
}
