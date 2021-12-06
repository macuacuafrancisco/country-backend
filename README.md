# country-backend

<p>Descrição: Este Desafio foi desenvolvido em Java com uso do Spring Framework, usa uma base de dados relacional POSTGRESQL,

<p>Objectivo: Desenvolver uma API RESTful que nos permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

<p>Modelo: Um país pertence a uma sub-regiao, uma sub-região pertence a uma região

Como Testar:
<p>1 - Cadastar Região
<p> POST : https://backend-2ibi.herokuapp.com/api/v1/regions
<p> BODY :  name (String)
  
<p>2 - Cadastar Sub-região (contem ID da Região)
<p> POST : https://backend-2ibi.herokuapp.com/api/v1/sub-regions
<p> BODY :  name (String), region(Long - ID da região)
  
<p>3 - Seguir os passos abaixo para CRIAR,LISTAR,MODIFICAR,ELIMINAR paises
<p> BODY :  name (String), capital (String), area (String), subRegion(Long - ID da sub-região) 

<p>
<p>a) - Criar um novo país a partir da API criada com todas as suas propriedades;
<p>method=POST 
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/

<p>b) - Listar todos os países anteriormente criados;
<p>method=GET 
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/

<p>c) - Modificar os dados de um país anteriormente criado;
<p>method=PUT 
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/13

<p>d) - Eliminar um país anteriormente criado;
<p>method=DELETE 
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/13

<p>e) - Ordenar a lista dos países por qualquer uma das suas propriedades.
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/{propriedade}

<p>EXEMPLOS : 
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/name
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/capital
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/area
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/subRegion
<p>https://backend-2ibi.herokuapp.com/api/v1/countries/sort/by/region
