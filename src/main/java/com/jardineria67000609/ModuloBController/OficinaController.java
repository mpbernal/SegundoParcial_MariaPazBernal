package com.jardineria67000609.ModuloBController;

import com.example.Jardineria.ModuloA.Entity.GamaProducto;
import com.jardineria67000609.ModuloA.DTO.OficinaDTO;
import com.jardineria67000609.ModuloA.Service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Oficina")
public class OficinaController {
    @Autowired
    private OficinaService oficinaService;

    @GetMapping
    public List<Oficina> findAll(){
        return oficinaService.getOficina();
    }


    @GetMapping("/{gama}")
    public Optional<GamaProducto> getById(@PathVariable("gama")String gama){
        return oficinaService.getOficina(gama);
    }

    @PostMapping("/Crear")
    public void save(@RequestBody OficinaDTO oficinaDTO){
        oficinaService.save(oficinaDTO);
    }
    @PutMapping("/Actualizar")
    public void update(@RequestBody OficinaDTO oficinaDTO){
        oficinaService.update(oficinaDTO);
    }

    @DeleteMapping("/{gama}")
    public void delete(@PathVariable("gama") String gama){
        oficinaService.delete(oficina);
    }


}

