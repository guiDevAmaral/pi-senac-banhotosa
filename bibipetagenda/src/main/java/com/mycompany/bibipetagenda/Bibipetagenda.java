/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibipetagenda;

import model.Agendamento;
import service.AgendamentoService;

public class Bibipetagenda {

public static void main(String[] args) {
        AgendamentoService service = new AgendamentoService();

        // Teste 1: Agendamento Válido
        System.out.println(service.salvarAgendamento(new Agendamento("Thor", "Banho", 10)));

        // Teste 2: Agendamento Inválido (Fora do horário)
        System.out.println(service.salvarAgendamento(new Agendamento("Mel", "Tosa", 22)));

        // Listar resultados
        service.listarAgenda();
    }
}
