# ExercicioTecelagem
 Utilização de uma classe para manipular arrays



EXERCÍCIO PROPOSTO
O projeto ExTecelagem está disponível na seção de Arquivos do canal da aula de hoje. Para este projeto crie uma nova classe que declare e manipule uma lista de funcionários. O tipo base da lista deve ser a classe Funcionario, mas a lista irá conter funcionários. dos três tipos: Administracao, Vendas e Producao.

O construtor da classe deve receber por parâmetro a capacidade máxima da lista.

Para esta classe faça os seguintes métodos:


public boolean addFunc(Funcionario f)

Adiciona o funcionário indicado no final da lista.
Deve verificar se ainda há espaço na lista para a nova adição,
caso a lista esteja lotada retorna false e não adiciona o funcionário.

public void relatorioAdministracao()

Lista todos os funcionários da administração imprimindo todos seus atributos.
No final o relatório deve totalizar o salário líquido dos funcionários.

public void relatorioVendas()

Lista todos os funcionários de vendas imprimindo todos seus atributos.
No final o relatório deve totalizar as vendas dos funcionários.

public void relatorioProducao()

Lista todos os funcionários da produção imprimindo todos seus atributos.
No final o relatório deve totalizar as horas diurnas e noturnas dos funcionários.
