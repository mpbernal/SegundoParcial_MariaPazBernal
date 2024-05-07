package com.jardineria67000609.ModuloAuditoria.ErrorEvent;

import java.util.Date;


public class ErrorEvent {
    private Date timestamp;
    private String errorMessage;
    private String action;
    private String Empleado;

    // Constructor
    public ErrorEvent(Date timestamp, String errorMessage, String action, String Empleado) {
        this.timestamp = timestamp;
        this.errorMessage = errorMessage;
        this.action = action;
        this.Empleado = Empleado;

    }
        // Getters y setters
        public Date getTimestamp () {
            return timestamp;
        }

        public void setTimestamp (Date timestamp){
            this.timestamp = timestamp;
        }

        public String getErrorMessage () {
            return errorMessage;
        }

        public void setErrorMessage (String errorMessage){
            this.errorMessage = errorMessage;
        }

        public String getAction () {
            return action;
        }

        public void setAction (String action){
            this.action = action;
        }

        public String getEmpleado() {
            return Empleado;
        }

        public void setEmpleado (String empleado){
            this.Empleado = empleado;
        }
    }