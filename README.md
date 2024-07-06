  # Desafio Java - CONSUMIR DADOS DA API ViaCEP

Esse projeto é um desafio do curso básico de Java Básico.

Baseado nas instruções de https://github.com/alura-cursos/2944-java-desafio.


## Sobre o Projeto

Implementar uma aplicação para consultar um endereço a partir de um CEP e salvar as informações em um arquivo json.


## Ferramentas

- [Java](https://www.java.com/)

 
## Objetivos

- Criar uma classe que representa um endereço (cep, uf, cidade, bairro, logradouro e complemento);
- Criar uma classe que consulta a API ViaCEP para buscar um endereço a partir de um cep (exemplo: https://viacep.com.br/ws/04101300/json);
- Criar uma classe que cria um arquivo json contendo os dados de um objeto Endereco;
- Criar uma classe com método main que deve solicitar ao usuário que informe um CEP e na sequencia utilizar as classes para consultar a api ViaCEP e salvar os dados do endereço em um arquivo json.

## Observações:
- Utilize a biblioteca GSon para converter o JSON devolvido pela API ViaCEP em um objeto Endereco;
- Utilize a biblioteca GSon para salvar um objeto Endereco em um arquivo .json;
- O arquivo deve ter como nome o cep informado (exemplo: 04101300.json);


## Minha Solução

<b>TELA 1</b>

Consulta ao CEP informado, realizada com sucesso.

![image](https://github.com/Camila-Barros/DesafioJavaBasico4/blob/master/Image1.png)


<b>TELA 2</b>

Arquivo com os dados do CEP informado, e nomeado com o próprio CEP.

![image](https://github.com/Camila-Barros/DesafioJavaBasico4/blob/master/Image2.png)

<b>TELA 3</b>

Consulta ao CEP informado não realizada, devido ao CEP não ter sido encontrado.

![image](https://github.com/Camila-Barros/DesafioJavaBasico4/blob/master/Image3.png)





## Autora

Eng. Camila Cabral de Barros

Mestranda em Inovação Tecnológica pela UNIFESP

[Lattes](http://lattes.cnpq.br/2066462797590469)

