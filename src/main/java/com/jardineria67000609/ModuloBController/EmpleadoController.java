package com.jardineria67000609.ModuloBController;


import com.example.Jardineria.ModuloA.Entity.Producto;
import com.example.Jardineria.ModuloA.Repository.EmpleadoRepository;
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
    public List<Producto> findAll(){
        return empleadoService.getEmpleados();
    }


    @GetMapping("/{id}")
    public Optional<Producto> getById(@PathVariable("id")String id){
        return empleadoService.getEmpleados(id);
    }

    @PostMapping("/crear")
    public void crearProducto(@RequestBody EmpleadoDTO productoDTO) {
        empleadoService.save(EmpleadoDTO);
    }
    @PatchMapping("/Actualizar")
    public void guardarProducto(@RequestBody EmpleadoDTO productoDTO) {
        empleadoService.update(EmpleadoDTO);
    }

    @DeleteMapping("/eliminar")
    public void delete(@RequestParam String nombre){
        empleadoService.delete(nombre);
    }

    @GetMapping("/porNombre")
    public List<Producto> buscarEmpleadosPorNombre(@RequestParam String nombre) {
        return empleadoRepository.findByNombre(nombre);
    }
}
