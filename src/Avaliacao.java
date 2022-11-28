/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.time.LocalDate;

public class Avaliacao {
    
    int id;
    
    String nome;
    
    String componente;
    
    Nota nota;
    
    LocalDate dataRealizacao;

    public Avaliacao(int id, String nome, String componente, Nota nota, LocalDate dataRealizacao) {
        this.id = id;
        this.nome = nome;
        this.componente = componente;
        this.nota = nota;
        this.dataRealizacao = dataRealizacao;
    }
    
    
}
