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
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        

        ListaFuncionario p1;
        p1 = new ListaFuncionario(10);
        
        
        
        Administracao a1= new Administracao("João", "1234-05", 10000);
        Administracao a2= new Administracao("Pedro", "1334-05", 12000);
        
    
        Producao p2= new Producao("Joca", "24445-94", 60);
        Producao p3 = new Producao("Marcelo", "24445-94", 30);
        
        Vendas v1= new Vendas("Maria", "7635-12", 1200);
        Vendas v2= new Vendas("Rita", "45765-12", 1500);
        
        
        p1.addFunc(a1);
        p1.addFunc(a2);      
        p1.relatorioAdministracao();
        
        p1.addFunc(p2);
        p1.addFunc(p3);
        p2.registrarHorasDiurnas(10);
        p3.registrarHorasDiurnas(10);
        p1.relatorioProducao();
        
        p1.addFunc(v2);
        p1.addFunc(v1);
        v1.registrarVenda(500);
        v1.registrarVenda(600);
        p1.relatorioVendas();
        
        
        
//        a1.hollerith();
//        a1.registrarFalta();
//        a1.registrarFalta();
//        a2.registrarFalta();
//        a1.hollerith();
//        
     
//        
//        p1.registrarHorasDiurnas(100);
//        p1.registrarHorasNoturnas(100);
//        p2.registrarHorasDiurnas(80);
//        p2.registrarHorasNoturnas(80);
//        p1.hollerith();
//        
    
//        
//        v1.registrarVenda(200000);
//        v2.registrarVenda(250000);
//        
//        v1.hollerith();
//        v1.novoMes();
//        v1.hollerith();
//        System.out.println();
//     
        
     
        
    }
    
}
