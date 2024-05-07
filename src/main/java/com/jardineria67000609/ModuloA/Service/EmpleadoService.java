package com.jardineria67000609.ModuloA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Jardineria.ModuloA.Repository.EmpleadoRepository;
import com.example.Jardineria.ModuloA.Entity.Empleado;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public Optional<Empleado> getEmpleados(Long id){
        return EmpleadoRepository.findById(id);
    }

    public void saveOrUpdate(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    public void delete(Long id){
        EmpleadoRepository.deleteById(id);
    }
}
