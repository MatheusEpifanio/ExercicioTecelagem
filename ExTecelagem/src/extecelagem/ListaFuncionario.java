/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extecelagem;

/**
 *
 * @author epifa
 */
public class ListaFuncionario {
   private Funcionario lista[];
   private int c =0;
   
   
   
    public ListaFuncionario(int max)
    {
    lista = new Funcionario[max];
        
    }
    
    
    public boolean addFunc(Funcionario f)
    {
    
       if(c > lista.length)
       {
         
        return false;   
           
       } 
    
       lista[c] = f;
       c++;
       return true;
       
    }
    
    
    public void relatorioAdministracao()
    {
         double total = 0;
        System.out.println("*******************Relatório ADM*******************");
        Funcionario.cabecalho();
        for(int i = 0; i <= c;i++ )  
        {

           if(lista[i] instanceof Administracao)
           {
              
             Administracao a = (Administracao)lista[i]; 
               
                
               
                a.print();
               total += a.salarioLiquido();
                
               
            }
          
        }
         System.out.println("\n*******************TOTAL SALÁRIOS******************");
         System.out.printf("Total dos salarios->%10.2f\n",total);
         System.out.println("***************************************************\n");
    }
    
    
    public void relatorioVendas()
    {
        double total = 0;
             System.out.println("************************Relatório Vendas*************************");
        Vendas.cabecalho();
        for(int i= 0; i<=c; i++ )
        {
            if(lista[i] instanceof Vendas )
            {
            Vendas a = (Vendas)lista[i];
            
            a.print();
            total+=a.getTotVendas();
            }
        }
          System.out.println("\n***************************TOTAL VENDAS**************************");
          System.out.printf("Vendas Acumuladas->%10.2f\n",total );
          System.out.println("*****************************************************************\n");
    }
    



    
    public void relatorioProducao()
    {
        System.out.println("******************************Relatório Produção******************************");
        double total1 =0;
        double total2 = 0;
        Producao.cabecalho();
        for(int i= 0; i<=c; i++ )
        {
            if(lista[i] instanceof Producao )
            {
               Producao a = (Producao)lista[i];
               a.print();
               total1 += a.getHrDia();
               total2 += a.getHrNoite();
            }
     
    
         }
        System.out.println("\n*********************************TOTAL HORAS**********************************");
        System.out.println("Total de horas diurnas->" + total1 + "\n" + "Total de horas noturnas" + total2);
        System.out.println("******************************************************************************\n");
    }
    
}/////////////////////
