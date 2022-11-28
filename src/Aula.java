/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.LinkedList;

public class Aula {
    
    
    int numero;
    
    String nome;
    
    String sumario;
    
    int numeroAlunos;
    
    Duracao duracao;
    
    LinkedList<Aluno> alunos;

    /*public Aula(LinkedList<Aluno> alunos) {
        this.alunos = new LinkedList<>();
    }*/
    
    public void adicionar(Aluno aluno){
        if(aluno == null || alunos.contains(aluno)){
            return;
        }
        alunos.add(aluno);
    }
    
    public void remover(Aluno aluno){
        if(!alunos.contains(aluno)){
            return;
        }
        alunos.remove(aluno);
    }
    
    

    
    

    
    
}
