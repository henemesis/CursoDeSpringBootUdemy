# 1ª Parte  
  
## Configurações e Ferramentas  

### Spring Tools Suite  
  
1. Baixar o STS (Spring Tools Suite);  
2. Criar o projeto com new → Spring Starter Project;  
  
**Inserir imagem..**  
  
3. Em New Spring Starter Project Dependencies, escolher os requisitos de dependências necessários ao projeto:  
  
**Inserir imagem..**  
  
4. Criar o pacote Entity separado para a melhor organização do projeto:  
  
### INSTALAÇÃO E CONFIGURAÇÃO DO MYSQL NO LINUX → LINKS NECESSÁRIOS  
  
https://www.digitalocean.com/community/tutorials/como-instalar-o-mysql-no-ubuntu-18-04-pt  

https://stackoverflow.com/questions/7864276/cannot-connect-to-database-server-mysql-workbench  

https://stackoverflow.com/questions/43094726/your-password-does-not-satisfy-the-current-policy-requirements  

****  

## Seção 2 – Aula 09  
– Spring Data Repositores → Repository → Trata-se de um padrão de projeto.  
  
→ Comunicação entre a camada da lógica de negócio e a fonte de dados (Data Source).  

Query objects → Objetos em forma de queries de banco de dados.  
  
Disponibiliza a inserção de entradas nas tabelas de banco de dados!   
  
### Trecho de código retirado da aula 09:  
  
Instanciando um novo usuário; --> Feito antes do if. 1ª Parte da aula: todo código abaixo  

```java  
User user = new User();
user.setEmail("thiagão@email.com");
user.setName("Thiagão");
// Para cadastrar, chamamos a UserRepository
userRepository.save(user);
``` 
****  
##   Seção 2 – Aula 10  
  
```java  
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true  
#Faz um carregamento "preguiçoso" no hibernate do SpringBoot  
```  
* JPA – É uma especificação, para que todos sigam o padrão. Trabalha a persistência em bancos de dados.  
  
API do java para trabalhar com dados.  
  
Lembrar de configurar o H2:  
**Colar Imagem..**  
****  
  
# GIT NOTAS DE AULA  
  
1. Classe que ficará na raiz, não pode ficar em outro lugar! Application Project  

2. Precisamos criar um identificador, uma chave primária para o nosso banco  
	
3. Para o Hibernate basta os getters e setter para gerar o banco!
  
**Notas da Seção 2** → O processo de mapeamento pode ser feito com qualquer banco de dados relacional!  
****
  
## Seção 3 - aula 7  
Para criar o banco devemos copiar as configurações do site: https://spring.io/guides/gs/accessing-data-mysql/ e logo em seguida inserir em  aplication.properties inserir as configurações do Mysql:
  
1. Site:  
**Inserir Imagem**  
  
2. application.properties:  
**Inserir Imagem**  
****  

## Seção 3. Aula 18  

Injeção de dependências: Utilizar um objeto sem a necessidade de criar uma instância!  

No SPRING:  

* Ao invés de new objeto → @Autowired!

As observações do código encontram-se no package: projeto2  

pacote da aula: exemplo  
****

## Seção 3. Aula 21 Spring Context  

No decorrer da aula, usa-se uma controller na classe principal.  

@Controller = torna um componente disponível para acesso HTTP para um ‘path’ adicionado.  

Spring Context = responsável por chamar, instanciar, configurar as classes e os beans do contexto do spring.  
****  

## Seção 3. Aula 22 @Qualifier  

package da aula: exemplo2  

@Qualifier == Decide qual implementação devo utilizar na hora de rodar a aplicação.  
****  

## Seção 3. Aula 23 @Profille

package da aula: exemplo2  
Será utilizado o @Configuration…  

@Configuration == classe DevConfig → Trata-se de uma classe de configuração.  

public class BeanDev → Onde temos as nossas configurações de desenvolvimento.  

ProdConfig → Classe que será utilizada pela produção.  

BeanProd → Bean que tratará a produção.  
****  

## Seção 4. Aula 27. → Stereotypes do Spring

Utilizados para definir os Beans e o Contexto do Spring.
Exemplos de stereotypes:  

@Component == Inicia-se a application, pode ser um Bean, e através dessa annotation podemos chamar as demais  

@Controller == Responsável pelo modelo Spring MVC.  

@RestController == Tem response, retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP como JSON ou XML. (Estudando no site Medium(artigo)).  


@Repository == Interface entre o banco de dados e os dados gerados para a controler ou para service  

@Service == Trata a regra de negócios.  
****

## Seção 4. Aula 28. → @ComponentScan

@ComponentScan // Realiza o mapeamento de pacotes – Configuração legada ao Spring Framework, não faz referências ao Spring boot.  

Package de aula = aulas  
****  

## Seção 5. Aula 32. → Application.yml  

Package de aula = aulas2  
****  

## Seção 6. Aula 35. → Criar uma página HTML  

Package de aula = aulas3  

Seção 6. Aula 36. → Protocolo HTTP  

### Verbos HTML:  
	O protocolo HTTP define oito métodos == GET, POST, HEAD, PUT, DELET, TRACE, OPTIONS E CONNECT. (São os verbos HTML).  
****

## Seção 6. Aula 37. → Métodos HTTP na prática com Spring  

Package de aula = aulas3 → Observar os comentários em cada um  
****

## Seção 6. Aula 38. → Forms  

Package de aula = aulas4   
****  

## Seção 6. Aula 39. → Debug  

Package de aula = aulas4
****  

## Seção 7. Aula 43. → ManyToOne  

Package de aula = aulas5  

A partir da criação desse package é possível trabalhar com a persistência dos dados.  
****  

## Seção 7. Aula 44. → Enums  

Package de aula = aulas5  

@Enumerated(EnumType.STRING) → "Transforma" de enum númerico para enum string  

A partir da interface RoleRepository que estende a JpaRepository conseguimos criar um CRUD completo sem a necessidade da criação de outros métodos.  
****  

## Seção 7. Aula 45. → Paginação  

Package de aula = aulas5-1  
****  

## Seção 7. Aula 46. → Persistence  

Package de aula = aulas5-1  
****  

## Seção 7. Aula 48. → Classes do nosso diagrama  

Package de aula = aulas5-2 → Observar os comentários em cada um  
****

## Seção 7. Aula 49. → @Query  

Package de aula = aulas5-2  
****  

## Seção 8. Aula . 54→ Criando o nosso primeiro endpoint Rest  

Package de aula = projeto (Intellij project), findAll() → Biblioteca da Controller responsável pela serialização da entidade User para a utilização dos dados no formato JSON  