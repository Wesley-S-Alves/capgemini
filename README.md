
# Desafio de Programação Academia Capgemini

      Repósitorio para o desafio de programação da Capgemini em parceira com a proway entre os dias 14/02 à 20/02 de 2022

# O Desafio

  As questões foram resolvidas em classes separadas,que estão contidas no diretório  /src/main/java, todos os requisitos foram concluídos e testados,
  os testes se encontram no diretório /src/main/test e as questões também foram separadas por classe.

## Questão 1.

Na Questão 1 foi nos pedido a criação de um algoritmo que contruisse uma escada utilizando o caractere * e espaços,sendo que a última linha
da escada não poderia ter espaços vazios.

## Solução 1.

Para essa questão foi utilizada a função StringBuilder para a criação de uma String mutável, e loops para adicionar os novos espaços e astericos.

```bash
criaEscada(5);
```
Saída:
```bash
     *
    **
   ***
  ****
 *****
 ```
 
 
 ##Questão 2.
 
 Na Questão 2 foi nos pedido a criação de um algoritmo de verificação de senha com os seguintes critérios:
- Possuir no mínimo 6 caracteres.
- Conter no mínimo 1 digito.
- Conter no mínimo 1 letra em minúsculo.
- Conter no mínimo 1 letra em maiúsculo.
- Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

##Solução 2.

Nessa questão foram utilizados condicionais if e a biblioteca regex para procura dos tipos de caracteres inseridos.

```bash
checaSenha("123")
```
Saída:
```bash
Sua senha possui apenas 3 caractere(s), faltando 3 caractere(s) para ser considerada uma senha segura.
Adicione pelo menos um destes caracteres especiais: !@#$%^&*()-+
Adicione uma letra minúscula a senha.
Adicione uma letra maiúscula a senha.
```

##Questão 3.

Na Questao 3 foi nos pedido a criação de um algoritmo que calcula anagramas pares dentro de uma palavra.

##Solução 3.

Nesta questão foram utilizado HashMap para verificar as arrays de char, loops e condicinais if.

```bash
calculaAnagrama("ifailuhkqq")
```
Saída:
```bash
3
```

# Versão GUI.
 Foi adicionado também uma versão GUI para o desafio que está localizada no diretório /src/main/java/gui, sendo inicializado pela classe TelaInicial.java
 
 ## Tela Inicial
 
  ![Tela Inicial](https://user-images.githubusercontent.com/75279678/154556408-1f3365ae-3774-4cf1-b9f2-f2e2fae1af53.gif)


## Questão 1.

![CriaEscada](https://user-images.githubusercontent.com/75279678/154556445-c58b5f1c-c16f-4f28-986e-6360ad999583.gif)

## Questão 2.

![ChecaSenha](https://user-images.githubusercontent.com/75279678/154556457-cf8c837e-387d-402d-9923-d259fc6ee3df.gif)

## Questão 3.

![CalculadoraAnagramas](https://user-images.githubusercontent.com/75279678/154556473-40c4a81b-eda4-4a58-8672-f9d22dd093b7.gif)


