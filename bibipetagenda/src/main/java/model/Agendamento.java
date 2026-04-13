/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Amaral
 */
public class Agendamento {
    private String nomePet;
    private String servico; // Banho, Tosa ou Ambos
    private int hora; // Apenas a hora cheia para facilitar (ex: 14)

    public Agendamento(String nomePet, String serviço, int hora) {
        this.nomePet = nomePet;
        this.servico = serviço;
        this.hora = hora;
    }

    public Agendamento() {
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    

    // Getters e Setters
    public String getNomePet() { return nomePet; }
    public String getServiço() { return servico; }
    public int getHora() { return hora; }
    
}
