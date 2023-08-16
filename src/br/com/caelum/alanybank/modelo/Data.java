package br.com.caelum.alanybank.modelo;
public class Data {
   private int dia;
   private  int mes;
   private int ano; 

    String dataFormat(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        return this.dia + "/"+this.mes+"/"+this.ano;

    }
}
