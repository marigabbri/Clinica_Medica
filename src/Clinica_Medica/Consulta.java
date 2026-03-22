package Clinica_Medica;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
Classe de Associação: Consulta. Ela deve conter a
Data (use LocalDateTime), o ValorDaConsulta e as referências para o Médico e o Paciente.
 */
public class Consulta {
    private LocalDateTime data;
    private float valorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta(){

    }
    public Consulta(Medico medico, Paciente paciente, float valorDaConsulta, LocalDateTime data){
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
    }

    public LocalDateTime getData(){
        return data;
    }
    public void setData(LocalDateTime data){
        this.data = data;
    }

    public float getValorDaConsulta(){
        return valorDaConsulta;
    }
    public void setValorDaConsulta(float valorDaConsulta){
        this.valorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico(){
        return medico;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }

    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public String toString(){
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");
        return "Dados - Consulta {\n Medico = "+this.medico+
                "\nPaciente = "+paciente+ "\nValor = "+this.valorDaConsulta+
                "\nData " +this.data.format(formatoBR);
    }
}
//Medico medico, Paciente paciente, LocalDateTime data, float valorDaConsulta