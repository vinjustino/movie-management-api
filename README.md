# 🎬 Movie Management API

API REST para gerenciamento de catálogo de filmes, atualmente com operações básicas de CRUD.

🚧 Funcionalidades como categorias, plataformas de streaming e autenticação com JWT estão em desenvolvimento.

---

## 📌 Objetivo

Desenvolver uma API REST robusta e escalável para:

- [x] Cadastro de filmes (CRUD)
- [ ] Organização por categorias
- [ ] Associação com plataformas de streaming
- [ ] Autenticação de usuários com JWT

---

## 🛠️ Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- Spring Security

---

## 📡 Endpoints

### 🎬 Filmes

- POST /api/movie → Criar filme
- GET /api/movie → Listar todos os filmes
- GET /api/movie/{id} → Buscar filme por ID
- PUT /api/movie/{id} → Atualizar filme
- DELETE /api/movie/{id} → Deletar filme

---
## 🚧 Status do Projeto

- [x] CRUD de filmes implementado
- [ ] Categorias
- [ ] Streaming
- [ ] Autenticação (JWT)

## 🚀 Próximos passos
- Adicionar gerenciamento de categorias (CRUD e relacionamento com filmes)
- Implementar autenticação e autorização com JWT
- Implementar validações e tratamento de erros
- Documentar a API com Swagger