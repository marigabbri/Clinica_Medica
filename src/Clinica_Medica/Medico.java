package Clinica_Medica;
/*
Exercício 1: Sistema de Clínica Médica
Crie um sistema para gerenciar consultas.

Classes: Medico (id, nome, especialidade) e Paciente (id, nome, cpf).
Classe de Associação: Consulta. Ela deve conter a Data (use LocalDateTime), o ValorDaConsulta e as referências para o Médico e o Paciente.
Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */
public class Medico{
    private int id;
    private String nome;
    private String especialidade;

    public Medico(){

    }
    public Medico(int id, String nome, String especialidade){
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public int getId(){
        return id;
    }
    public void seId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String toString(){
        return "Dados - Médico  { \n id = "+this.id+"\n Nome = " +this.nome+
                "\nEspecialidade = "+this.especialidade+"\n}";
    }
}