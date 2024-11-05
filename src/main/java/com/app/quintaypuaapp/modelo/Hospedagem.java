package com.app.quintaypuaapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Hospedagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matricula;
    @OneToMany
    @JoinColumn(name = "quartos", referencedColumnName = "registro")
    private Quartos quartos;
    @OneToMany 
    @JoinColumn(name = "servicos", referencedColumnName = "iD")
    private Servicos servicos;
    private double total;
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Quartos getQuartos() {
        return quartos;
    }
    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }
    public Servicos getServicos() {
        return servicos;
    }
    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

}
 