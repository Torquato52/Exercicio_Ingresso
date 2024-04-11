package view;

import models.Ingresso;
import models.IngressoVIP;

public class View {

    public static void criarIngressos() {
        Ingresso ingressoNormal1 = new Ingresso("Ingresso 1 Normal", 20);
        ingressoNormal1.setValor(ingressoNormal1.valorFinal(20));
        Ingresso ingressoNormal2 = new Ingresso("Ingresso 2 Normal", 73);
        ingressoNormal2.setValor(ingressoNormal2.valorFinal(10));
        IngressoVIP ingressoVIP1 = new IngressoVIP("Ingresso 1 Vip", 20);
        ingressoVIP1.setFuncao("GESTOR DE EVENTOS");
        ingressoVIP1.setValor(ingressoVIP1.valorFinal(20));
        IngressoVIP ingressoVIP2 = new IngressoVIP("Ingresso 2 Vip", 73);
        ingressoVIP2.setFuncao("BARISTA");
        ingressoVIP2.setValor(ingressoVIP2.valorFinal(10));


        System.out.println(ingressoNormal1);
        System.out.println(ingressoNormal2);
        System.out.println(ingressoVIP1);
        System.out.println(ingressoVIP2);
    }

}
