/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appestacionamento;

/**
 *
 * @author 13125877
 */
public class Carro {
   private int id;
   private String marca;
   private String placa;
   private String cor;
   private int horaEntrada;
   private int horaSaida;

   
   
   
    public Carro(String marca) {
        this.marca = marca;
    }

    public Carro(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    public Carro(String marca, String placa, String cor) {
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
    }

    public Carro(String marca, String placa, String cor, int horaEntrada) {
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.horaEntrada = horaEntrada;
    }

    public Carro(String marca, String placa, String cor, int horaEntrada, int horaSaida) {
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    Carro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
   
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   
   
}
