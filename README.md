# ATIVIDADE DE FRAMEWORKS BACKEND.
-----------------
## AULA 01 — INTRODUÇÃO AO BACK-END E FRAMEWORKS.
### ATIVIDADE 01 — Fluxo cliente e servidor:

O cliente faz uma requisição HTTP para o sistema pela a URL -> GET/cursus, o sistema acessa o back-end e retorna uma reposta HTTP para o cliete.

Cliente:

- Requisição HTTP
- GET/cursos
- 
Back-end:

- Processamento
- Consulta os cursos
- 
Back-end:

- Resposta HTTP
- Dados do curso(lista de cursos)

-----------------

### ATIVIDADE 02 — Responsabilidades do back-end:

Ao receber um cadastro de curso, o Back-End não funciona apenas como uma tela. Ele é responsável por receber, processar, validar e armazenar os dados, além de devolver uma resposta ao cliente.

- 1. Receber os dados enviados pelo cliente.

O cliente envia uma requisição HTTP contendo os dados do curso.

{
    "nome": "Java Spring Boot",
    "cargaHoraria": 40
}

- 2. Transformar os dados em um objeto Java.

O Spring Boot recebe o JSON enviado pelo cliente e transforma os dados em um objeto da classe Curso.

JSON
  ↓
Objeto Java Curso

- 3. Verificar as regras do curso.

O Back-End deve verificar se os dados recebidos são válidos de acordo com as regras definidas pela aplicação.

Nomes não pode estar vazio e nem repetido.


- 4. Salvar o curso

Depois da validação, o Back-End utiliza o serviço e o repositório para armazenar o curso no banco de dados.

Controller
    ↓
Service
    ↓
Repository
    ↓
Banco de dados

- 5. Devolver uma resposta ao cliente

Depois de realizar o processamento, o servidor envia uma response HTTP informando o resultado da operação.

--------------
ATIVIDADE 03 — Contrato inicial da API
| Opearação | Metodo HTTP | URL | Descrição | 
|---|----|----|----|
| Lista | GET/ | cursos | Retorna uma lista com todos os cursos já registrado | 
| Busca ID | GET/ | cursos/id | Busca e retorna o curso pelo o ID | 
| Criar | POST/ | cursos | Cria e salva o curso  | 
| Atualizar | PUT/ | cursos/id | Troca as informação antigas por novas |
| Deletar | DEL/ | cursos/id | Busca pelo o ID e deleta | 
