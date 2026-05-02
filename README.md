# 🖥️ presenSee-back

# 📡 API de Monitoramento de Frequência Escolar

## 📌 Sobre o projeto

Este repositório contém o **backend** do sistema *presenSee*, responsável por gerenciar os dados e regras de negócio relacionadas ao monitoramento da frequência escolar.

A API é responsável por processar informações de cadastro, login, presença dos alunos e análise de dados, servindo como base para o funcionamento do sistema web e mobile.

---

## 🎯 Objetivos

### Objetivo geral

Desenvolver uma API que gerencie os dados do sistema e aplique regras de negócio para auxiliar na identificação da evasão escolar.

### Objetivos específicos

* Gerenciar cadastro de usuários (alunos, professores, etc.)
* Realizar autenticação (login)
* Processar registros de presença
* Aplicar regras de análise de frequência
* Servir dados para frontend web e mobile

---

## ⚙️ Funcionalidades

* ✅ Cadastro de usuários
* ✅ Sistema de login
* ✅ Validação de dados
* 🔄 Integração com registro de presença (em desenvolvimento)
* 🔄 Regras de evasão (em desenvolvimento)

---

## 🧠 Regras de negócio (implementadas nos testes)

* Cadastro só é válido com:
  - nome preenchido
  - email válido (contendo "@")
  - senha com no mínimo 6 caracteres

* Login só é válido com:
  - email correto
  - senha correta

---

## 🧪 Testes unitários

Foram implementados testes unitários para garantir o funcionamento das principais funcionalidades do sistema.

### Classes testadas:

* `CadastroService`
* `LoginService`

### Cenários testados:

✔ Cadastro com dados válidos  
✔ Cadastro com nome vazio  
✔ Cadastro com email inválido  
✔ Cadastro com senha curta  

✔ Login com dados corretos  
✔ Login com email incorreto  
✔ Login com senha incorreta  

---

## 🏗️ Estrutura do projeto
backend/
├── src/main/java/com/presensee/
│ ├── CadastroService.java
│ └── LoginService.java
│
├── src/test/java/com/presensee/
│ ├── CadastroServiceTest.java
│ └── LoginServiceTest.java
│
├── pom.xml
└── README.md

---

## 🚀 Como rodar o projeto

### Pré-requisitos

* Java instalado
* Maven instalado
---
### Passos

```bash
# entrar na pasta do backend
cd backend

# rodar os testes
mvn test

✅ Resultado esperado

Ao executar os testes, deve aparecer:

BUILD SUCCESS

Isso significa que todos os testes passaram corretamente.
---
🔐 Segurança
Validação básica de dados
Estrutura preparada para autenticação futura
Organização para evolução com boas práticas
---
👨‍💻 Equipe
Miguel Augusto
Echilin Taina
Ygor de Tárcio
Maysa Clara
Ludmylla Dias
Matheus Vinnycius
Pedro Henrique Jerônimo
Gabriel Soares
---
📌 Status do projeto

🚧 Em desenvolvimento (Projeto Integrador IV)
---
💡 Contribuição
Crie uma branch (feature/nome-da-feature)
Faça suas alterações
Abra um Pull Request
---
📄 Licença

Este projeto é acadêmico e sem fins lucrativos.
