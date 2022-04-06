#Mostrar todos os registros da tabela de filmes.
SELECT * FROM movies_db.actors;

#Mostrar o nome, sobrenome e classificação de todos os atores.
SELECT first_name, last_name, rating FROM movies_db.actors;

#Mostrar o título de todas as séries e use alias para que tanto o nome da tabela quanto o campo estejam em Português.
SELECT title AS titulo FROM movies_db.series;

#Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5.
SELECT first_name, last_name  FROM movies_db.actors WHERE rating > 7.5;

#Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação superior a 7,5 e com mais de dois prêmios.
SELECT title FROM movies_db.movies WHERE rating > 7.5 AND awards > 2;

#Mostrar o título dos filmes e a classificação ordenados por classificação em ordem crescente.
SELECT title FROM movies_db.movies WHERE rating ORDER BY rating ASC;

#Mostrar os títulos dos três primeiros filmes no banco de dados.
SELECT title FROM movies_db.movies LIMIT 3;

#Mostrar os 5 melhores filmes com a classificação mais alta.
SELECT title, MAX(rating) AS rating FROM movies_db.movies GROUP BY title ORDER BY rating DESC LIMIT 5;

#Listar os 10 primeiros atores.
SELECT first_name, last_name FROM movies_db.actors ORDER BY id LIMIT 10;

#Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
SELECT title, rating FROM movies_db.movies WHERE title LIKE '%Toy Story%';

#Mostrar todos os atores cujos nomes começam com Sam.
SELECT first_name, last_name FROM movies_db.actors WHERE first_name like '%SAM%';

#Mostrar o título dos filmes que saíram entre 2004 e 2008.
SELECT title FROM movies_db.movies WHERE release_date BETWEEN '2004-01-01' AND '2008-12-31'; 

#Mostrar o título dos filmes com classificação superior a 3, com mais de 1 prêmio e com data de lançamento entre 1988 e 2009. Ordenar os resultados porclassificação.
SELECT title FROM movies_db.movies WHERE rating > 3 AND awards > 1 AND release_date BETWEEN '1988-01-01' AND '2009-12-31' ORDER BY rating DESC; 