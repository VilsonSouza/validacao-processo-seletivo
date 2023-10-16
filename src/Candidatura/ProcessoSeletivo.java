package Candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public void imprimirSelecionados(){

    }

    public void atendeu(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");


    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    public void selecaoCandidatos(){
        int candidatosCont =0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        while (candidatosCont<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            if (salarioBase>=salarioPretendido){
                System.out.println("Candidato: "+candidato+" Salario Pedido: "+  salarioPretendido);
                candidatosCont++;
            }
            candidatoAtual++;


        }



    }


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    public  void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("Ligar Para o Candidato");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contraproposta");
        }
        else{
            System.out.println("Aguardando Demais Candidatos");
        }
    }
}
