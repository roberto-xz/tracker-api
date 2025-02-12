
# API de Rastreamento de Pacotes  

## Introdução  

Este projeto é uma atividade acadêmica desenvolvida com o objetivo de aplicar conceitos fundamentais da engenharia de software, incluindo:  
- Protocolo HTTP e arquitetura REST;  
- Padrões de projeto e organização de código;  
- Padrão MVC para separação de responsabilidades;  
- Integração com banco de dados relacional;  
- Desenvolvimento de APIs eficientes e seguras.  

A API foi projetada para fornecer um serviço de rastreamento de pacotes e gerenciamento de transporte, permitindo que sistemas externos integrem suas operações logísticas de maneira eficiente.  

## Escopo  

### O que será entregue  
A API fornecerá endpoints para:  
- Cadastro de pacotes, veículos, motoristas, transporte e contêineres;  
- Atualização de status e localização das entregas;  
- Registro de histórico de movimentações dos pacotes;  
- Consultas de rastreamento acessíveis a sistemas externos.  

### O que **não** está incluído  
- Automação de processos logísticos (ex.: alocação automática de motoristas ou veículos);  
- Lógica para determinar se há transporte disponível, motoristas livres ou veículos adequados;  
- Infraestrutura do sistema (deploy, servidores, configuração de rede);  
- Manutenção e suporte pós-implementação.  

A responsabilidade pela automação e integração do módulo no sistema final cabe à equipe que utilizará a API.  

## Dependências  

O projeto utiliza as seguintes tecnologias e bibliotecas:  
- ✅ **Spring Boot Web** – Para criação da API REST  
- ✅ **Spring Boot JPA** – Para integração com banco de dados  
- ✅ **MySQL Driver** – Para comunicação com o banco de dados MySQL  
- ✅ **Spring Boot DevTools** – Para facilitar o desenvolvimento e recarregamento automático  
- ✅ **Swagger (SpringDoc OpenAPI)** – Para documentação automática da API  

## Tarefas  

| Código  | Descrição | Autor | Status |
|---------|--------------------------------------|-------------|-----------|
| TSK_01  | Criação do projeto no GitHub        | roberto-xz  | Concluída |
| TSK_02  | Configuração do Spring Boot         | maria-dev   | Em andamento |
| TSK_03  | Modelagem do banco de dados         | joao-code   | Pendente |
| TSK_04  | Implementação do CRUD de Pacotes    | roberto-xz  | Em andamento |
| TSK_05  | Documentação da API com Swagger     | maria-dev   | Pendente |

## Como Contribuir  

1. Faça um fork do repositório.  
2. Crie uma branch para a nova funcionalidade (`git checkout -b feature-nome-da-feature`).  
3. Desenvolva a funcionalidade e faça commits (`git commit -m "Descrição da mudança"`).  
4. Envie um pull request para revisão.  

## Contato  

Para dúvidas ou sugestões, entre em contato com os desenvolvedores do projeto.  
