package com.app.quintaypuaapp.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.quintaypuaapp.modelo.Hospedagem;
import com.app.quintaypuaapp.modelo.Hospede;
import com.app.quintaypuaapp.modelo.Quartos;
import com.app.quintaypuaapp.modelo.Servicos;

@RestController
public class Controle {

    @GetMapping("/boasVindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome + "!";
    }
    @PostMapping("/cliente")
    public Hospede hospede(@RequestBody Hospede cliente){
        return cliente;
    }
    @PostMapping("/quartos")
    public Quartos quarto(@RequestBody Quartos quartos){
        return quartos;
    }
    @PostMapping("/servicos")
    public Servicos servicos(@RequestBody Servicos servicos){
        return servicos;
    }
    @PostMapping("/hospedagem")
    public Hospedagem hospedagem(@RequestBody Hospedagem hospedagem){
        return hospedagem;
    }
}
