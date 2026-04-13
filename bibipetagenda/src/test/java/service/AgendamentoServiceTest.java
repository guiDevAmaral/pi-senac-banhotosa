/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package service;

import model.Agendamento;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Amaral
 */
public class AgendamentoServiceTest {
    
    public AgendamentoServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of salvarAgendamento method, of class AgendamentoService.
     */
    @Test
    public void testSalvarAgendamentoFalha() {
    // 1. Criamos os objetos necessários
    AgendamentoService service = new AgendamentoService();
    Agendamento a = new Agendamento();
    
    // 2. Definimos um cenário de sucesso (ex: 10h)
    a.setNomePet("Bob");
    a.setHora(7);
    
    // 3. Executamos e validamos
    String resultado = service.salvarAgendamento(a);
    assertEquals("Erro: O pet shop funciona apenas das 08h às 18h.", resultado);
}
    
    @Test
public void testSalvarAgendamentoSucesso() {
    // 1. Criamos os objetos necessários
    AgendamentoService service = new AgendamentoService();
    Agendamento a = new Agendamento();
    
    // 2. Definimos um cenário de sucesso (ex: 10h)
    a.setNomePet("Bob");
    a.setHora(10);
    
    // 3. Executamos e validamos
    String resultado = service.salvarAgendamento(a);
    assertEquals("Sucesso: Agendamento de Bob realizado!", resultado);
}

    /**
     * Test of listarAgenda method, of class AgendamentoService.
     */
    @Test
    public void testListarAgenda() {
        System.out.println("listarAgenda");
        AgendamentoService instance = new AgendamentoService();
        instance.listarAgenda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
