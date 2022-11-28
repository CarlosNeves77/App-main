/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.LinkedList;


public class Aluno {
    
    String idAluno;
    
    String nome;
    
    LinkedList<Aula> aulas;
    
    public Aluno(){
        aulas = new LinkedList<>();
    }

    public void associar(Aula aula) {
        aula.adicionar(this);
    }
    
    public void desassociar(Aula aula){
        aula.remover(this);
    }
    
    
}
