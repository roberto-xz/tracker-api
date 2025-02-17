
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


---

# Estrutura do Projeto

Este projeto segue uma organização modular baseada na separação de responsabilidades. A estrutura de pacotes foi projetada para manter um código limpo, escalável e de fácil manutenção.

## Estrutura de Pacotes

```plaintext
src/
├── controller/
│   ├── package/
│   │   ├── CreatePackage.java
│   │   ├── UpdatePackage.java
│   │   ├── DeletePackage.java
│   │   └── GetPackage.java
│   ├── container/
│   ├── transport/
│   └── dto/
│       ├── package/
│       │   ├── RequestPackageDto.java
│       │   └── ResponsePackageDto.java
│       ├── container/
│       └── transport/
├── service/
│   ├── package/
│   │   ├── PackageService.java
│   │   ├── PackageValidationService.java
│   │   └── OtherPackageService.java
│   ├── container/
│   └── transport/
├── event/
│   ├── package/
│   │   ├── CreatedPackageEvent.java
│   │   ├── UpdatedPackageEvent.java
│   │   └── DeletedPackageEvent.java
│   ├── container/
│   └── transport/
├── observer/
│   ├── package/
│   │   ├── PackageObserver.java
│   │   ├── PackageStatusObserver.java
│   │   └── PackageAuditObserver.java
│   ├── container/
│   └── transport/
├── repository/
│   ├── package/
│   │   ├── PackageRepository.java
│   │   ├── CustomPackageRepository.java
│   │   └── PackageQueryRepository.java
│   ├── container/
│   └── transport/
└── util/
    ├── DateUtil.java
    ├── StringUtil.java
    └── ValidationUtil.java
```

## Descrição dos Pacotes

- **controller/** → Contém as classes responsáveis por lidar com as requisições e chamar os serviços adequados.
  - **dto/** → Pacotes para cada entidade contendo classes `RequestDto` e `ResponseDto`.

- **service/** → Contém a lógica de negócios e serviços relacionados às entidades.

- **event/** → Define eventos do sistema, como criação, atualização e exclusão de entidades.

- **observer/** → Implementa o padrão Observer para responder a eventos do sistema.

- **repository/** → Contém os repositórios responsáveis pela comunicação com o banco de dados.

- **util/** → Contém classes auxiliares e utilitárias reutilizáveis.

Essa estrutura modular facilita a escalabilidade e a manutenção do código.

---


## Como Contribuir  

1. Faça um fork do repositório.  
2. Crie uma branch para a nova funcionalidade (`git checkout -b feature-nome-da-feature`).  
3. Desenvolva a funcionalidade e faça commits (`git commit -m "Descrição da mudança"`).  
4. Envie um pull request para revisão.  

