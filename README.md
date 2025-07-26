# 📝 API de Tarefas

 API REST com um CRUD simples de tarefas que realiza as operações de criar, consultar, atualizar e deletar tarefas em um banco de dados relacional, utilizando PostgreSQL.

---

## 🚀 Tecnologias utilizadas

- **Spring Boot**
- **Maven**
- **JPA**
- **PostgreSQL**

---

## 🧩 Estrutura do Projeto

- `Controller` → Classe `TarefaController` para criar os endpoints  
- `Model` → Classe `Tarefa` para estruturar a tarefa  
- `Repository` → Classe `TarefaRepository` para salvar os dados no banco  
- `Service` → Classe `TarefaService` com a lógica principal do projeto, especialmente a comunicação com o banco

---

## 🔗 Endpoints

| Método | Rota             | Descrição                              |
|--------|------------------|----------------------------------------|
| GET    | /tarefas         | Lista todas as tarefas                 |
| GET    | /tarefas/{id}    | Busca uma tarefa pelo ID               |
| POST   | /tarefas         | Cria uma nova tarefa                   |
| PUT    | /tarefas/{id}    | Atualiza uma tarefa existente pelo ID  |
| DELETE | /tarefas/{id}    | Remove uma tarefa pelo ID              |

---

## ⚙️ Configuração

> ⚠️ No `application.properties`, utilizei **variáveis de ambiente** para conectar ao banco de dados.

Exemplo:
```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
