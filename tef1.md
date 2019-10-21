# Introdução

Para o TeF1 o grupo 5 estará levando em conta alguns objetivos a serem realizados durante o projeto, como por exemplo uma melhoria na suíte de testes do software, o software escolhido como projeto real a ser trabalhado será o [Translate-me](https://github.com/translate-me/docs), por fim no projeto abordado teremos documentado uma melhoria de qualidade do software em relação a testes.

# Tema

O tema definido no projeto será uma suíte de testes para uma projeto real que foi definido pelo grupo para desenvolvimento de uma suíte de testes para o software [Translate-me](https://github.com/translate-me/docs).

# Problemas

O intuito dos testes a serem realizados em todo o sistema [Translate-me](https://github.com/translate-me/docs), composto pelos serviços de **Autenticação**, **Profile**, **Fontend** e a api **Translate-me**, é garantir uma maior qualidade de código e usabilidade, assumindo uma integração mais eficiente entre os serviços e podendo medir a qualidade do projeto.

# Sistema

O sistema que será testado é o [Translate-me](https://github.com/translate-me/docs), projeto realizado na disciplina de Arquitetura e Desenho de Software no 1º semestre de 2019.
[Translate-me](https://github.com/translate-me/docs) é um sistema que consiste em conectar uma pessoa que precisa realizar a tradução de um texto com tradutores.

# Testes

### Teste unitário

Testes unitário são feitos com a finalidade de verificar o funcionamento de um pedaços isolados do sistema e que possam ser testados separadamente.

### Teste automatizado

Teste automazados é um processo executam scripts de teste pré-programados em uma aplicação. A automatização de teste tem como objetivo simplicar a vida dos testadores.
Teste automatizado será utilizado para testar o front-end do translate-me.

### Teste de usabilidade

Os testes devem ser realizados com um usuário para verificar a facilidade do uso do software. Devem ser levados em conta o conteúdo e a clareza.

### Teste de aceitação

Os testes de aceitação são realizados por algum usuário, para verificar se a solução atende aos requisitos do projeto. Voltados para funcionalidades e usabilidades, e esses testes são realizados com o suporte da equipe dos desenvolvedores, auxiliando o usuário.

# Ferramentas

As ferramentas utilizadas para a realização dos teste unitários e automatizados serão:

- Pytest
- Unittest
- Selenium
- Jest

# GQM

## Objetivo de Equipe 1.0

| Analisar           | Os testes do projeto |
| ------------------ | -------------------- |
| Com o proposito de | Avaliar              |
| Em relação ao      | Testabilidade        |
| Do ponto de vista  | da Aplicação         |
| No contexto        | de Software          |

### Questão 1.0

O aplicação do translate.me é bem testada?

#### Metrica 1.0

Cobertura de testes na aplicação

## Objetivo de Equipe 2.0

| Analisar           | A usabilidade do produto |
| ------------------ | ------------------------ |
| Com o proposito de | Avaliar                  |
| Em relação ao      | Usabilidade              |
| Do ponto de vista  | do Usuário               |
| No contexto        | UX e UI                  |

### Questão 2.0

O software é bem intuitivo?

#### Metrica 2.0

Teste de usabilidade

## Objetivo de Equipe 3.0

| Analisar           | Funcionalidades separadamente                 |
| ------------------ | --------------------------------------------- |
| Com o proposito de | Verificar se a aplicação continua funcionando |
| Em relação a       | alteração na base de código                   |
| Do ponto de vista  | Aplicação                                     |
| No contexto        | Software                                      |

### Questão 3.0

As funcionalidades funcionam idependentes de mudanças no código?

#### Metrica 3.0

Teste unitário

## Objetivo de Equipe 4.0

| Analisar           | Qualidade                                       |
| ------------------ | ----------------------------------------------- |
| Com o proposito de | Verificar os requisitos de aceitação do usuário |
| Em relação a       | qualidade do software                           |
| Do ponto de vista  | usuário                                         |
| No contexto        | Qualidade                                       |

### Questão 4.0

As funcionalidades funcionam idependentes de mudanças no código?

#### Metrica 4.0

Teste unitário

## Detalhamento das métricas

### Métrica 1.0 - Cobertura de testes na aplicação

| Objetivo de medição | Verificar a quantidade de testes na aplicação                |
| ------------------- | ------------------------------------------------------------ |
| Entidade            | Testes                                                       |
| Tipo                |                                                              |
| Escala de medição   |                                                              |
| Coleta              | Coletado pela execução dos testes do projeto periodicamente  |
| Procedimento        | Executar os testes com a porcentagem de cobertura            |
| Análise             | Porcentagem de testes                                        |
| Providência         | Caso a porcentagem esteja baixa mais testes devem ser feitos |

### Métrica 2.0 - Teste de usabilidade

| Objetivo de medição | Verificar a usabilidade do projeto                                                                             |
| ------------------- | -------------------------------------------------------------------------------------------------------------- |
| Entidade            | Testes                                                                                                         |
| Tipo                |                                                                                                                |
| Escala de medição   |                                                                                                                |
| Coleta              | Coletado através de testes com potenciais usuários da aplicação                                                |
| Procedimento        | Entrevistas com potenciais usuários solicitando para que eles cumpram algumas atividades utilizando o software |
| Análise             | As dificuldades e facilidades que o usuário encontra ao utilizar a aplicação                                   |
| Providência         | Caso o software não esteja intuitivo, devem ser levantadas alternativas para deixar o programa mais usual      |

### Métrica 3.0 - Teste unitário

| Objetivo de medição | Verificar funcionalidades do software                                     |
| ------------------- | ------------------------------------------------------------------------- |
| Entidade            | Testes                                                                    |
| Tipo                |                                                                           |
| Escala de medição   |                                                                           |
| Coleta              | Coleta através de scripts de testes no software                           |
| Procedimento        | scripts funcionais para testar o software                                 |
| Análise             | Possiveis erros que poderão ser encontrados em algumas partes do software |
| Providência         | Refatorar o bloco de código que foi encontrado o erro                     |

### Métrica 4.0 - Teste de aceitação

| Objetivo de medição | Verificar o sistema em relação aos seus requisitos originais |
| ------------------- | ------------------------------------------------------------ |
| Entidade            | Testes                                                       |
| Tipo                |                                                              |
| Escala de medição   |                                                              |
| Coleta              |                                                              |
| Procedimento        |                                                              |
| Análise             |                                                              |
| Providência         |                                                              |

# Planejamento

Todos os testes serão realizados entre o período de 21/10 a 15/11.
Para os testes, os membros do grupo se dividirão entre os serviços **Autenticação**, **Profile**, **Fontend** e a api **Translate-me**.

| Serviço      | Teste unitário |        Teste automatizado         | Teste de usabilidade | Teste de aceitação |
| ------------ | :------------: | :-------------------------------: | :------------------: | :----------------: |
| Autenticação |       x        |                 -                 |          -           |         x          |
| Profile      |       x        |                 -                 |          -           |         x          |
| Fontend      |       -        |                 x                 |          x           |         x          |
| Translate-me |       x        |                 -                 |          -           |         x          |
|              |                | Tabela de relação SERVIÇO x TESTE |                      |                    |

# Referências

- [Translate-me](https://translate-me.github.io/docs/)
- [Técnicas e critérios de teste](https://www.tiespecialistas.com.br/tecnicas-e-criterios-de-teste/)
