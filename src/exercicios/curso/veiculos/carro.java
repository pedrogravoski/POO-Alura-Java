package exercicios.curso.veiculos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class carro {
    private double precoAnoUm ;
    private double precoAnoDois ;
    private double precoAnoTres ;
    private String modelo;


    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAnoUm, double precoAnoDois, double precoAnoTres){
       this.precoAnoUm = precoAnoUm;
       this.precoAnoDois = precoAnoDois;
       this.precoAnoTres = precoAnoTres;
    }

    public void retornaPrecos(){
        System.out.println("Preco media: " + mediaPreco());
        System.out.println("Maior preço: " + maiorPreco());
        System.out.println("Menor preco " + menorPreco());
    }

    public double maiorPreco(){
        double maior = this.precoAnoUm;
        if(this.precoAnoDois > maior){
            maior = this.precoAnoDois;
        }
        if(this.precoAnoTres > maior){
            maior = this.precoAnoTres;
        }
        return maior;
    }


    public double menorPreco(){
        double menor = this.precoAnoUm;
        if(this.precoAnoDois < menor){
            menor = this.precoAnoDois;
        }
        if(this.precoAnoTres < menor){
            menor = this.precoAnoTres;
        }
        return menor;
    }

    public double mediaPreco(){
        double media =(this.precoAnoUm + this.precoAnoDois + this.precoAnoTres) / 3;
        return Math.round(media * 100.0) / 100.0;
    }

}
