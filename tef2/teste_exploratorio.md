## Testes exploratórios

Foi utilizado o teste exploratório com a metáfora do turista para o serviço de frontend do translate-me,

### Teste no distrito de negócios

Esse distrito representa a parte mais importante da aplicação, que no caso é o fluxo de enviar um documento para ser traduzido.
Para realização desse teste foi considerado a situação de um novo usuário abrindo o site pela primeira vez e necessitando de um serviço de tradução, portanto serão realizados dois tours focados em pontos de referências,sendo um para o autor e um para o tradutor. Os pontos de referência definidos para cada perfil são:

- **Autor**:
  - Registro de novo usuário (autor)
  - Visualizar meu perfil
  - Submissão do texto para a tradução
- **Tradutor**:
  - Registro de novo usuário (tradutor)
  - Visualizar meu perfil
  - Visualizar textos aguardando tradução
  - Traduzir um texto

#### Realização do teste

##### Autor

O registro ocorre sem problemas, nenhum aviso ou mensagem de erro é mostrado, assim como no login, porém a homepage ficou toda em branco ao ser acessada, impossibilitando o usuário de realizar qualquer ação, conforme mostra a imagem abaixo.
![](https://i.imgur.com/QcpkbSM.png)
A causa do erro é uma requisição realizada ao micro-serviço "translate-me", responsável pela lógica principal de tradução do app, que não consegue processar a requisição devido ao ponto no nome de usuário.

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

**Todos os erros abaixo foram causados pelo nome do usuário, que possuia um ponto e por causa disso todo o fluxo principal do app**

- Realizando o teste foram identificados os seguintes erros:

- Tour pelos pontos de referência do autor:

  - Registro de novo usuário (autor):
    Essa funcionalidade do app não demonstrou nenhum problema.

  - Visualizar meu perfil:
    Aparentemente essa funcionalidade não está implementada.

  - Submissão do texto para a tradução:
    Erro do servidor não permitiu o teste da funcionalidade visto que a página estava em branco.

- Tour pelos pontos de referência do tradutor:

  - Registro de novo usuário (tradutor): Não foi possível completar o registro devido a um erro na aplicação.

  - Visualizar meu perfil: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.

  - Visualizar textos aguardando tradução: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.

  - Traduzir um texto: Não foi possível visitar a funcionalidade pois não foi possível virar um prestador.

#### Repetição do teste

Visto que o nome de usuário que o sistema deixou cadastrar foi o responsável por grande parte dos erros avaliados no teste anterior, foi decidido repetir o teste sem ponto no nome de usuário para ver como o programa lida com o fluxo sem o impedimento do nome.

##### Autor

Assim como na etapa anterior, o registro e o login acontecem sem problemas, porém é identificado o mesmo problema ao logar que o usuário com o ponto no nome: uma página branca e sem conteúdo, com a diferença da requisição que antes tinha sido falha e agora retorna com sucesso, conforme demonstra a imagem abaixo.
![](https://i.imgur.com/wK4ffe1.png)

A homepage do aplicativo só é exibida ao atualizar a página.
Ao clicar em submeter texto, o aplicativo abre uma tela de upload **sem dar informações detalhadas sobre tipo de arquivos suportados ou tamanho máximo**, ao tentar submeter qualquer arquivo o upload falha, conforme demonstra a imagem.

![](https://i.imgur.com/WzmzDq3.png)

Com a falha do upload, foi utilizado o campo de input para inserção do texto a ser traduzido e funcionou sem problemas, levando para uma página para o usuário adicionar informações sobre o texto submentido, onde não foi encontrado nenhum erro.

Na página seguinte o usuário é requisitado a definir os pontos de quebra do texto, a precisão é ruim e o acrescimo de breakpoints acrescenta o numero total de letras do texto, coisa que não deveria ocorrer, além disso o botão de realizar pagamento não consegue realizar a ação que ele deveria realizar.
![](https://i.imgur.com/um95rfW.png)

##### Tradutor

O processo de registro do tradutor dá erro, exatamente igual ao do teste anterior, mas ao deslogar da aplicação, lá existe a opção de "entrar como tradutor", realizando o login por essa opção é apresentado uma página em branco com uma foto de perfil não coerente á do usuário logado:

![](https://i.imgur.com/WKy0oXt.png)

E nenhuma das outras páginas pode ser acessada, ficando todas em branco.

#### Resultado do teste

- Realizando o teste foram identificados os seguintes erros:

- Tour pelos pontos de referência do autor:

  - Registro de novo usuário (autor):
    Essa funcionalidade do app não demonstrou nenhum problema.

  - Visualizar meu perfil:
    Essa funcionalidade não está implementada.

  - Submissão do texto para a tradução:
    Alguns erros no fluxo e o botão responsável por enviar o texto para análise não consegue concluir a requisição, retornando cod. 400.

- Tour pelos pontos de referência do tradutor:

  - Registro de novo usuário (tradutor): Foi exibido um erro no final do processo mas aparentemente o cadastro é realizado com sucesso.

  - Visualizar meu perfil: Funcionalidade não implementada.

  - Visualizar textos aguardando tradução: Não foi possível localizar a funcionalidade pois não foi possível cadastrar um texto para ser traduzido.

  - Traduzir um texto: Não foi possível localizar a funcionalidade pois não foi possível cadastrar um texto para ser traduzido.
