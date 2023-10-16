package DesafioControleFluxo;

public class ParametrosInvalidosException extends Exception {
    public void imprimeErro(String msg){
        System.out.println(msg);
    }

    public ParametrosInvalidosException() {

    }
}
