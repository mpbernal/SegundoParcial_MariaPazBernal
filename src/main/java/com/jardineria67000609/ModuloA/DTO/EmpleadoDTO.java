package com.jardineria67000609.ModuloA.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmpleadoDTO {

    @Setter
    @Getter
    private String nombre;
    @Setter
    @Getter
    private String apellido1;
    @Setter
    @Getter
    private String apellido2;
    @Setter
    @Getter
    private String extension;
    @Setter
    @Getter
    private String email;
    @Setter
    @Getter
    private String codigoOficina;
    @Setter
    @Getter
    private Integer codigoEmpleadoRepVentas;
    @Setter
    @Getter
    private Integer limiteCredito;


    public Integer getlimiteCredito() {
        return limiteCredito;
    }

    public Integer getcodigoEmpleadoRepVentas() {
        return codigoEmpleadoRepVentas;
    }

    public void setcodigoEmpleadoRepVentas(Integer codigoEmpleadoRepVentas) {
        this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
    }

        public String getNombre(){
            return nombre;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getapellido1 () {
            return apellido1;
        }

    public String getapellido2() {
            return apellido2;
        }

        public void setapellido2(String descripcion){
            this.apellido2 = apellido2;
        }

        public String getextension() {
            return extension;
        }

        public void setextension (String extension){
            this.extension = extension;
        }

        public String getemail () {
            return email;
        }

        public void setemail (String email){
            this.email = email;
        }

        public String getcodigoOficina () {
            return codigoOficina;
        }

        public void setcodigoOficina (String codigoOficina){
            this.codigoOficina = codigoOficina;
        }
    }
