package com.jardineria67000609.ModuloBController;

import com.jardineria67000609.ModuloA.DTO.OficinaDTO;
import com.jardineria67000609.ModuloA.Entity.Oficina;
import com.jardineria67000609.ModuloA.Service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public Optional<Oficina> getById(@PathVariable("gama")String oficina){
        return oficinaService.getOficina(oficina);
    }

    @PostMapping("/Crear")
    public void save(@RequestBody OficinaDTO oficinaDTO){
        oficinaService.save(oficinaDTO);
    }
    @PutMapping("/Actualizar")
    public void update(@RequestBody OficinaDTO oficinaDTO){
        oficinaService.update(oficinaDTO);
    }

    @DeleteMapping("/{Oficina}")
    public void delete(@PathVariable("oficina") String gama){
        oficinaService.delete(Oficina);
    }


}

