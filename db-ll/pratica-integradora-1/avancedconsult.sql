# Mostrar o título e o nome do gênero de todas as séries.
SELECT series.*, name 
FROM series 
INNER JOIN genres 
ON genres.id = series.genre_id;

#Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em cada um deles.
SELECT actors.first_name, episodes.title 
FROM actors
INNER JOIN actor_episode
ON actors.id = actor_episode.actor_id
INNER JOIN episodes
ON episodes.id = actor_episode.episode_id;

#Mostrar o título de todas as séries e o número total de temporadas que cada uma delas possui.
SELECT series.title, COUNT(*)
FROM series 
INNER JOIN seasons
ON seasons.serie_id = series.id
GROUP BY series.title;

# Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde que seja maior ou igual a 3.
SELECT genres.name, COUNT(*) as total_movies 
FROM genres
INNER JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING total_movies >= 3;

#Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de Star Wars e que estes não se repitam.
SELECT DISTINCT actors.first_name, actors.last_name 
FROM actors
INNER JOIN actor_movie
ON actors.id = actor_movie.actor_id
INNER JOIN movies
ON actor_movie.movie_id = movies.id
WHERE movies.title LIKE 'La Guerra de las galaxias%';