/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Agendamento;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoService {
    private List<Agendamento> agenda = new ArrayList<>();

    public String salvarAgendamento(Agendamento a) {
        // Regra de Negócio: Horário comercial entre 08h e 18h
        if (a.getHora() < 8 || a.getHora() > 18) {
            return "Erro: O pet shop funciona apenas das 08h às 18h.";
        }
        
        agenda.add(a);
        return "Sucesso: Agendamento de " + a.getNomePet() + " realizado!";
    }

    public void listarAgenda() {
        System.out.println("--- Lista de Atendimentos ---");
        for (Agendamento a : agenda) {
            System.out.println("Pet: " + a.getNomePet() + " | Serviço: " + a.getServiço() + " | Hora: " + a.getHora() + "h");
        }
    }
}
