# Sistema de Cadastro de Mercadorias e Serviços

Projeto desenvolvido como trabalho acadêmico para a Universidade do Estado de Minas Gerais (UEMG).

## Autores

- Caio Cezar Dias
- Isabely Toledo de Melo

## Descrição

Aplicação em Java para cadastro e consulta de mercadorias e serviços via terminal.

## Estrutura do Projeto

O projeto é composto por quatro classes dentro do pacote `org.example`:

| Classe | Descrição |
|---|---|
| `Produto` | Classe base com atributos `codigo` e `nome`. Serve como superclasse para `Mercadoria` e `Servico`. |
| `Mercadoria` | Herda de `Produto` e adiciona o atributo `peso`. |
| `Servico` | Herda de `Produto` e adiciona o atributo `valorHora`. |
| `Main` | Classe principal com menu interativo e lógica de cadastro/busca. |

## Compilação e Execução

```bash
javac -d out src/org/example/*.java
java -cp out org.example.Main
```

Ou, caso utilize uma IDE como IntelliJ IDEA ou Eclipse, basta importar o projeto e executar a classe `Main`.