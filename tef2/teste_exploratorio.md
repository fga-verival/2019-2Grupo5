## Testes exploratórios

Foi utilizado o teste exploratório com a metáfora do turista para o serviço de frontend do translate-me,

### Teste no distrito de negócios

Esse distrito representa a parte mais importante da aplicação, que no caso é o fluxo de enviar um documento para ser traduzido.
Para realização desse teste foi considerado a situação de um novo usuário abrindo o site pela primeira vez e necessitando de um serviço de tradução, portanto serão realizados dois tours focados em pontos de referências,sendo um para o autor e um para o tradutor. Os pontos de referência definidos para cada perfil são:

- **Autor**:
  - Registro de novo usuário (autor)
  - Visualizar meu perfil
  - Submissão do texto para a tradução
  - Visualizar status do texto submetido
- **Tradutor**:
  - Registro de novo usuário (tradutor)
  - Visualizar meu perfil
  - Visualizar textos aguardando tradução
  - Traduzir um texto

#### Realização do teste

##### Autor

O registro ocorre sem problemas, assim como o login, porém a homepage ficou toda em branco ao ser acessada, impossibilitando o usuário de realizar qualquer ação, conforme mostra a imagem abaixo.
![](https://i.imgur.com/QcpkbSM.png)
A causa do erro é provavelmente uma requisição realizada ao micro-serviço "translate-me", responsável pela lógica principal de tradução do app.

Ao tentar acessar o perfil o resultado aparentemente é o mesmo: uma tela em branco sem funcionalidades
![](https://i.imgur.com/Hh4u2mG.png)
Porém diferente da homepage, essa página não apresenta nenhuma requisição para o micro-serviço de perfil ou para qualquer outro micro-serviço, o que remete á uma **provável** funcionalidade não implementada.

Ao retornar para a página inicial (Acessando a raiz do site novamente) é notável que o sistema não está salvando informações sobre login, pois o botão de logar está disponível e ao clicar nele o sistema exige as informações de autenticação novamente.
![](https://i.imgur.com/SJzZU3M.png)

##### Tradutor

Como tradutor a primeira tentativa de registro falhou com um erro de lógica, conforme demostra a imagem.
![](https://i.imgur.com/jY9v0CN.png)
Não permitindo a realização das visitas nos demais pontos de referência.

#### Resultado do teste

- Tour pelos pontos de referência do autor:

  - Registro de novo usuário (autor):
    Essa funcionalidade do app não demonstrou nenhum problema.

  - Visualizar meu perfil:
    Aparentemente essa funcionalidade não está implementada.

  - Submissão do texto para a tradução:
    Erro do servidor não permitiu o teste da funcionalidade visto que a página estava em branco.

  - Visualizar status do texto submetido:  
    Erro do servidor não permitiu o teste da funcionalidade visto que a página estava em branco.

- Tour pelos pontos de referência do tradutor:

  - Registro de novo usuário (tradutor): Não foi possível completar o registro devido a um erro na aplicação.

  - Visualizar meu perfil: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.

  - Visualizar textos aguardando tradução: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.

  - Traduzir um texto: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.
