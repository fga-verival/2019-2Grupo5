
<p align="center">
  <img style="width:500px;" src="https://upload.wikimedia.org/wikipedia/commons/c/c3/Webysther_20160322_-_Logo_UnB_%28sem_texto%29.svg" alt="UnB" />
</p>
<h1 align="center">Universidade de Brasília</h1>
<h2 align="center">Testes de *Software* - 2019/2</h3>

<h2 align="center">Grupo 5</h3>

<p align="center">Ezequiel de Oliveira dos Reis, 16/0119316 </p>
<p align="center">Felipe Campos de Almeida, 16/0119553 </p>
<p align="center">Gabriel Batista Albino Silva, 16/0028361 </p>
<p align="center">Gabriel de Jesus Carvalho, 16/0120918</p>
<p align="center">Gabriela Barrozo Guedes, 16/0121612 </p>
<p align="center">Helena Bretas Goulart, 16/0124034 </p>
<p align="center">Leticia Meneses Bandeira da Silva, 16/0131936 </p>
<p align="center">Vitor Leal dos Santos, 16/0148375</p>

***

# TFe1


## Introdução

Para o TeF1 o grupo 5 estará levando em conta alguns objetivos a serem realizados durante o projeto, como por exemplo, uma melhoria na suíte de testes do *software* escolhido. O grupo optou por um projeto real a ser trabalhado, o [*Translate-me*](https://github.com/*Translate-me*/docs). No fim do projeto abordado teremos documentado as melhorias de qualidade obtidas sobre o *software* em relação a testes.

## Tema

O tema definido no projeto é o desenvolvimento de uma suíte de testes para *software* [*Translate-me*](https://github.com/*Translate-me*/docs).

## Problemas

O intuito dos testes a serem realizados em todo o sistema [*Translate-me*](https://github.com/*Translate-me*/docs), composto pelos serviços de **Autenticação**, **Profile**, **Frontend** e a api ***Translate-me***, é garantir uma maior qualidade de código e usabilidade, assumindo uma integração mais eficiente entre os serviços e podendo medir efetivamente a qualidade do projeto.

## Sistema

O sistema a ser testado é o [*Translate-me*](https://github.com/*Translate-me*/docs), projeto desenvolvido na disciplina de *Arquitetura e Desenho de Software* no 1º semestre de 2019.
[*Translate-me*](https://github.com/*Translate-me*/docs) é um sistema que consiste em conectar tradutores com pessoas interessadas em consumir o serviço de tradução de textos.

## Testes

- ### Teste Unitário

Testes unitários são feitos com a finalidade de verificar o funcionamento de um pedaços isolados do código do sistema, em sua menor fração e que possam ser testados separadamente.

- ### Teste Automatizado

O testes automatizado é um processo de execução de scripts de teste pré-programados em uma aplicação. A automatização de teste tem como objetivo ajudar na execução de muitos casos de teste de consistentemente e em repetidas ocasiões.

- ### Teste de Usabilidade

Os testes de usabilidade consistem na observação de usuários reais durante a utilização do produto. O objetivo é descobrir problemas e pontos de melhoria no *software* de acordo com as dificuldades apresentadas pelos usuários. Devem ser levados em conta o desempenho, a precisão e a clareza com que os fluxos da aplicação são identificados pelo usuário.

- ### Teste de Aceitação

Os testes de aceitação são realizados por algum usuário, com o objetivo de verificar se a solução atende aos requisitos do projeto. Voltados para funcionalidades e usabilidade, esses testes são realizados com o suporte da equipe dos desenvolvedores, auxiliando o usuário.

- ### Teste Exploratório

Os testes exploratórios são realizados por algum usuário, com o objetivo de verificar se há erros nos fluxos da aplicação. Voltados para usabilidade e falhas, eles são realizados com o testador tomando decisões sobre o que será testado durante a execução do teste ao invés de seguir um roteiro previamente planejado.

## Ferramentas

As ferramentas utilizadas para a realização dos teste unitários e automatizados serão:

- [*Pytest*](https://docs.pytest.org/en/latest/)
- [*Unittest*](https://docs.python.org/3/library/unittest.html)
- [*Selenium*](https://www.seleniumhq.org/)
- [*Jest*](https://jestjs.io/)

## GQM

*Goal Question Metric* - GQM, é uma abordagem das métricas de *software* que foi promovida por Victor Basili, da Universidade de Maryland, College Park e pelo Laboratório de Engenharia de *Software* do Centro de Vôo Espacial Goddard da NASA após supervisionando um Ph.D. tese do Dr. David M. Weiss. O trabalho do Dr. Weiss foi inspirado no trabalho de Albert Endres na IBM Alemanha.

O GQM define um modelo de medição em três níveis:

- Nível Conceitual (Objetivo)

Uma meta é definida para um objeto, por várias razões, com relação a vários modelos de qualidade, de vários pontos de vista e relativos a um ambiente específico.
- Nível Operacional (Pergunta)

Um conjunto de perguntas é usado para definir modelos do objeto de estudo e, em seguida, focaliza esse objeto para caracterizar a avaliação ou a realização de um objetivo específico.
- Nível Quantitativo (Métrico)

Um conjunto de métricas, baseado nos modelos, é associado a todas as perguntas para respondê-las de maneira mensurável.

***

- ## Objetivo 1

  | Analisar           | Os testes do projeto |
  | ------------------ | -------------------- |
  | Com o proposito de | Avaliar              |
  | Em relação a       | Testabilidade        |
  | Do ponto de vista  | da Aplicação         |
  | No contexto        | de *Software*        |

- ### Questão 1

  A aplicação *Translate-me* é bem testada?

- ### Métrica 1

  Cobertura de testes na aplicação.

***

- ## Objetivo 2

  | Analisar           | A usabilidade do produto |
  | ------------------ | ------------------------ |
  | Com o proposito de | Avaliar                  |
  | Em relação a       | Usabilidade              |
  | Do ponto de vista  | do Usuário               |
  | No contexto        | UX e UI                  |

  - ### Questão 2

  O *software* é bem intuitivo?

  - ### Métrica 2

  Realização de testes de usabilidade na aplicação.

***

- ## Objetivo 3

  | Analisar           | Funcionalidades separadamente                 |
  | ------------------ | --------------------------------------------- |
  | Com o proposito de | Verificar se a aplicação continua funcionando |
  | Em relação a       | alteração na base de código                   |
  | Do ponto de vista  | Aplicação                                     |
  | No contexto        | *Software*                                    |

- ## Questão 3

  As funcionalidades funcionam independentes de mudanças no código?

- ## Métrica 3

  Realização de testes unitários na aplicação.

***

- ## Objetivo 4

    | Analisar           | Qualidade                                       |
    | ------------------ | ----------------------------------------------- |
    | Com o proposito de | Verificar os requisitos de aceitação do usuário |
    | Em relação a       | qualidade do *software*                         |
    | Do ponto de vista  | usuário                                         |
    | No contexto        | Qualidade                                       |

- ### Questão 4

  As funcionalidades estão de acordo com os requisitos do projeto?

- ### Métrica 4

  Realização de testes de aceitação na aplicação.

***

- ## Objetivo 5

  | Analisar           | Funcionalidades do aplicativo |
  | ------------------ | ----------------------------- |
  | Com o proposito de | Avaliar                       |
  | Em relação a       | Funcionalidades               |
  | Do ponto de vista  | Usuário                       |
  | No contexto        | Qualidade                     |

- ### Questão 5

  As funcionalidades funcionam como deveriam?

- ### Métrica 5

  Realização de testes de exploratórios na aplicação.

***

## Detalhamento das Métricas

### Métrica 1 - Cobertura de testes na aplicação

| Objetivo de medição | Verificar a quantidade de testes na aplicação                |
| ------------------- | ------------------------------------------------------------ |
| Entidade            | Testes                                                       |
| Tipo                | Objetiva                                                     |
| Escala de medição   | Racional                                                     |
| Coleta              | Coletado pela execução dos testes do projeto periodicamente  |
| Procedimento        | Executar os testes com a porcentagem de cobertura            |
| Análise             | Porcentagem de testes                                        |
| Providência         | Caso a porcentagem esteja baixa mais testes devem ser feitos |

### Métrica 2 - Teste de usabilidade

| Objetivo de medição                                              | Verificar a usabilidade do projeto                                                                          |
| ---------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| Entidade                                                         | Testes                                                                                                      |
| Tipo                                                             | Objetiva                                                                                                    |
| Escala de medição                                                | Nominal                                                                                                     |
| Coleta                                                           | Coletado através de testes com potenciais usuários da aplicação                                             |
| Procedimento                                                     | Entrevistas com potenciais usuários solicitando                                                             |
| para que eles cumpram algumas atividades utilizando o *software* |
| Análise                                                          | As dificuldades e facilidades que o usuário encontra ao utilizar a aplicação                                |
| Providência                                                      | Caso o *software* não esteja intuitivo, devem ser levantadas alternativas para deixar o programa mais usual |

### Métrica 3 - Teste unitário

| Objetivo de medição | Verificar funcionalidades de partes individuais *software*                  |
| ------------------- | --------------------------------------------------------------------------- |
| Entidade            | Testes                                                                      |
| Tipo                | Objetiva                                                                    |
| Escala de medição   |                                                                             |
| Coleta              | Coleta através de scripts de testes no *software*                           |
| Procedimento        | scripts funcionais para testar o *software*                                 |
| Análise             | Possíveis erros que poderão ser encontrados em algumas partes do *software* |
| Providência         | Refatorar o bloco de código que foi encontrado o erro                       |

### Métrica 4 - Teste de aceitação

| Objetivo de medição | Verificar o sistema em relação aos seus requisitos originais                       |
| ------------------- | ---------------------------------------------------------------------------------- |
| Entidade            | Testes                                                                             |
| Tipo                | Objetiva                                                                           |
| Escala de medição   | Nominal                                                                            |
| Coleta              | Coleta através de scripts de testes de aceitação no *software*                     |
| Procedimento        | Observar os requisitos do *software*                                               |
| Análise             | Comparação entre os requisitos de *software* e as funcionalidades da aplicação s   |
| Providência         | Refatorar o código novamente de modo que as funcionalidades atendam sos requisitos |

### Métrica 5 - Teste exploratório

| Objetivo de medição | Verificar funcionalidades e fluxos do sistema                                          |
| ------------------- | -------------------------------------------------------------------------------------- |
| Entidade            | Testes                                                                                 |
| Tipo                | Objetiva                                                                               |
| Escala de medição   | Nominal                                                                                |
| Coleta              | Coleta através de testes exploratórios na aplicação                                    |
| Procedimento        | Utilizar a metáfora do turista para explorar funcionalidades do aplicativo             |
| Análise             | Possíveis erros que poderão ser encontrados em algumas partes do *software*            |
| Providência         | Refatorar o código novamente de modo que as funcionalidades funcionem como o esperado. |

## Referencial Teórico

É certo que os testes realizados ao estilo _ad hoc_ tendem a levar muitos erros, uma vez que contém o critério livre em sua realização e execução. Para a cobertura de testes de um código, é necessário elaboração do planejamento do teste na qual uma das etapas é a elaboração da estratégia de
teste (CRESPO, 2004). Essa estratégia de teste contempla em qual fase do desenvolvimento do *software* o teste será realizado, a técnica a ser utilizada, os critérios a serem adotados e o tipo de teste aplicado. A falta de planejamento na realização de testes tende a levar ao tempo gasto com testes que não cobrirão todas as funcionalidades do código e que necessitarão de mais manutenção.

Além disso, é possível que até mesmo os códigos automatizados contenham erros, por isso recomenda-se que os testes sejam escritos da maneira mais simples e sucinta possível. Evitar códigos longos, repletos de variáveis condicionais, responsáveis por muitas verificações e também com nomes que tornam difícil (BERNARDO, 2008) a sua compreensão são pontos que podem auxiliar na escrita de testes de *software*.

O referencial bibliográfico deste trabalho trouxe informações importantes sobre os tipos de testes que serão utilizados, conforme demonstrado abaixo:

- Testes unitários permitem maior cobertura de teste : <br>
  O uso de testes unitários permite que testemos uma porção muito maior do código do sistema do que àquele feito manualmente. Sendo assim, torna-se mais fácil exercitar todos os caminhos possíveis do sistema nos testes unitários que nos testes manuais. Também torna-se mais fácil replicar condições determinadas com apenas a mudança de parâmetros em um método/classe, nos testes manuais seriam bem mais difícil tal acontecimento.

- Testes unitários previnem regressão: <br>
  Quando utilizamos testes unitários automatizados de forma consistente em uma boa suíte de teste, é possível evitar
  que novas modificações no *software* façam com que as modificações antigas deixem de funcionar corretamente, ou ao menos, é possível ter o controle em qual funcionalidade isso ocorreu.

- Testes unitários incentivam o refactoring: <br>
  Com o objetivo de poder obter uma melhor qualidade de código de forma contínua, os testes unitários incentivam a refatoração, pois independente das modificações feitas na refatoração, as funcionalidades têm de estar funcionando da mesma maneira que estavam antes da refatoração.

- Testes unitários evitam sessões de debug: <br>
  Conforme novas funcionalidades são adicionadas ao *software*, o processo de debug torna-se cada vez mais trabalhoso. Sendo assim, os testes unitários nos ajudam a identificar mais rapidamente problemas nas funcionalidades.

- Testes de unidade servem como documentação: <br>
  Os testes unitários simbolizam o comportamento do sistema, portanto quando bem escritos, ajudam novos desenvolvedores
  a entender o comportamento do sistema.

- Testes de aceitação servem como validação do projeto:
  Esses testes são realizados normalmente com o cliente, e, em caso de sua ausência, podem ser realizados também através da comparação entre os requisitos do *software* e o produto final. As simulações da operação de rotina do sistema são essenciais para verificar o comportamento do *software*.

## Planejamento

Todos os testes serão realizados entre o período de 21/10 a 15/11.
Para os testes, os membros do grupo se dividirão entre os serviços **Autenticação**, **Profile**, **Frontend** e a api ***Translate-me***.

A tabela de relação serviço x teste encontra-se abaixo.

| Serviço        | Teste unitário | Teste automatizado | Teste de usabilidade | Teste de aceitação |
| -------------- | :------------: | :----------------: | :------------------: | :----------------: |
| Autenticação   |       x        |         -          |          -           |         x          |
| Profile        |       x        |         -          |          -           |         x          |
| Frontend       |       -        |         x          |          x           |         x          |
| *Translate-me* |       x        |         -          |          -           |         x          |

## Referências Bibliográficas

[1][*Translate-me*](https://*Translate-me*.github.io/docs/) <br>
[2][técnicas e critérios de teste](https://www.tiespecialistas.com.br/tecnicas-e-criterios-de-teste/) <br>
[3] CRESPO, Adalberto Nobiato et al. Uma metodologia para teste de *Software* no Contexto da Melhoria de Processo. <b> Simpósio Brasileiro de Qualidade de *Software* </b>, p. 271-285, 2004. <br>
[4] BERNARDO, Paulo Cheque; KON, Fabio. <b> A importância dos Testes Automatizados. </b> Engenharia de *Software* Magazine, v. 1, n. 3, p. 54-57, 2008. <br>
[5] NETO, Arilo. Introdução a teste de *software*. <b> Engenharia de *Software* Magazine, </b> v. 1, p. 22, 2007. <br>
[6] CARVALHO, Ana Amélia Amorim. Testes de Usabilidade: exigência supérflua ou necessidade. In: <b> Actas do 5º congresso da sociedade portuguesa de ciências da educação. </b> 2002. p. 235-242. <br>
[7] ZHU, Hong; HALL, Patrick AV; MAY, John HR. <b> *Software* unit test coverage and adequacy </b>. Acm computing surveys (csur), v. 29, n. 4, p. 366-427, 1997.
