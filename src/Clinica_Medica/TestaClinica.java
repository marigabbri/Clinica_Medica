package Clinica_Medica;

import java.time.LocalDateTime;

/*
Desafio: No main, crie um médico e um paciente, e registre uma consulta para o dia 20/05/2026.
 */
public class TestaClinica {
    public static void main(String[] args) {
        Paciente p1 = new Paciente(1,"Janaina","123456779");
        Medico m1 = new Medico(1,"João","Ortopedista");
        LocalDateTime data = LocalDateTime.of(2026,3,21,
                2,22,26);
        Consulta c1 = new Consulta(m1,p1,20,data);
        System.out.println(c1.toString());
    }
    /*
    meu erro aqui tinha sido não colocar na ordem -> LocalDateTime.of
     (ANO, MES, DIA, HORA, MINUTO, SEGUNDO)
     */

}
