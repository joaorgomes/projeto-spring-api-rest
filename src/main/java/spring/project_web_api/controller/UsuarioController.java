package spring.project_web_api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.project_web_api.model.Usuario;
import spring.project_web_api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    public void postUsuario(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping
    public void atualizarUsuario(@RequestBody Usuario usuario){
        repository.update(usuario);
    }
    @GetMapping
    public List<Usuario> getUsuarios(){
        return repository.findtAll();
    }

    @GetMapping("/{userName}")
    public Usuario getOne(@PathVariable("userName") String userName){
        return repository.finByUserName(userName);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleById(id);
    }





}
