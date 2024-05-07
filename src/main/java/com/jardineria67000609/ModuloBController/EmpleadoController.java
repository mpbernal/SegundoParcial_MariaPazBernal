package com.jardineria67000609.ModuloBController;


import com.example.Jardineria.ModuloA.Repository.EmpleadoRepository;
import com.jardineria67000609.ModuloA.Entity.Empleado;
import com.jardineria67000609.ModuloA.DTO.EmpleadoDTO;
import com.jardineria67000609.ModuloA.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> findAll(){
        return empleadoService.getEmpleados();
    }


    @GetMapping("/{id}")
    public Optional<Empleado> getById(@PathVariable("id")String id){
        return empleadoService.getEmpleados(id);
    }

    @PostMapping("/crear")
    public void crearEmpleado(@RequestBody EmpleadoDTO productoDTO) {
        empleadoService.save(EmpleadoDTO);
    }
    @PatchMapping("/Actualizar")
    public void guardarEmpleado(@RequestBody EmpleadoDTO productoDTO) {
        empleadoService.update(EmpleadoDTO);
    }

    @DeleteMapping("/eliminar")
    public void delete(@RequestParam String nombre){
        empleadoService.delete(nombre);
    }

    @GetMapping("/porNombre")
    public List<Empleado> buscarEmpleadosPorNombre(@RequestParam String nombre) {
        return empleadoRepository.findByNombre(nombre);
    }
}
