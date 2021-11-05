/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extecelagem;

/**
 *
 * @author Usuario
 */
public abstract class Funcionario
{
    private String nome, rg;
    private double salBase;

    public Funcionario(String nome, String rg, double salBase) 
    {
        this.nome = nome;
        this.rg = rg;
        this.salBase = salBase;
    }
    
    // Getters e setters

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public double getSalBase() 
    {
        return salBase;
    }

    public void setSalBase(double salBase) 
    {
        this.salBase = salBase;
    }
    
    // Métodos
    public void hollerith()
    {
        System.out.println(
                "Nome:" + nome + "\n" +
                "Rg: " + rg + "\n" +
                "Salário base: " + salBase + "\n" +
                "Salário líquido: " + salarioLiquido());
    }
    
    public abstract double salarioLiquido();
    
    public abstract void novoMes();
    
    
    public static void cabecalho()
     {
           System.out.printf("%-10s | %-10s | %-10s | %-10s | ", "Nome", "RG", "Sal Base", "Sal Liq");
         
     }
    
    public void print()
    {
        System.out.printf("\n%-10s | %-10s | %10.2f | %10.2f | ",nome,rg,salBase,salarioLiquido());
    
    }
}
