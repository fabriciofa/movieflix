INSERT INTO tb_role(authority) VALUES('ROLE_VISITOR');
INSERT INTO tb_role(authority) VALUES('ROLE_MEMBER');

INSERT INTO tb_user(name, email, password) VALUES('Ana', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user(name, email, password) VALUES('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_user_role(user_id, role_id) VALUES(1, 2);
INSERT INTO tb_user_role(user_id, role_id) VALUES(2, 1);

INSERT INTO tb_genre(name) VALUES('Comédia');
INSERT INTO tb_genre(name) VALUES('Ação');
INSERT INTO tb_genre(name) VALUES('Fantasia');
INSERT INTO tb_genre(name) VALUES('Terror');

INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('A Lenda do Cavaleiro Verde', null, 2021, 'https://images.justwatch.com/poster/258848729/s592/the-green-knight.webp', 'Uma aventura épica de fantasia baseada na lenda intemporal de Artur, “O Cavaleiro Verde”, que conta a história de Sir Gawain (Dev Patel), sobrinho imprudente e obstinado do Rei Artur. Sir Gawain embarca numa ousada busca para enfrentar o Cavaleiro Verde epónimo, um gigantesco estranho de pele esmeralda, que coloca à prova os homens. Numa viagem, em que enfrentará fantasmas, gigantes, ladrões e maquinadores, Gawain vai acabar por definir o seu carácter e provar o seu valor aos olhos da sua família e do reino, ao enfrentar o derradeiro opositor.', 3);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Free Guy', 'Herói Improvável', 2021, 'https://images.justwatch.com/poster/252185144/s592/free-guy.webp', 'Um homem descobre que é realmente uma personagem de um jogo de vídeo. Guy (Ryan Reynolds) trabalha como caixa de banco, um tipo alegre e solitário cujo o dia nunca é aborrecido. Mesmo que seja usado como refém durante um assalto a um banco, continua a sorrir. Mas um dia apercebe-se de que a Cidade Livre não é bem a cidade que ele pensava que era. Guy está prestes a descobrir que é de facto uma personagem não jogável num jogo de vídeo brutal. Agora que sabe que é uma personagem de videojogo, Guy, acompanhado por Molotov Girl (Jodie Comer), decide enfrentar todos os vilões que assolam a cidade.', 3);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Bloodshot', null, 2020, 'https://images.justwatch.com/poster/174757942/s592/bloodshot.webp', 'Baseado no best-seller de banda desenhada, Vin Diesel protagoniza “Bloodshot” na pele de Ray Garrison, um soldado recentemente morto em combate e ressuscitado como o super – humano Bloodshot da empresa RST. Com um exército de nanotecnologia nas suas veias, Rayé uma força imparável – mais forte do que nunca e capaz de se curar instantaneamente. Mas, ao controlar o seu corpo, a empresa controla também a sua mente e as suas memórias. Agora, Ray não sabe o que é real e o que não é, mas está decidido a descobrir a verdade.', 2);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Kingsman', 'Serviços Secretos', 2014, 'https://images.justwatch.com/poster/23177558/s592/kingsman-the-secret-service.webp', 'Baseado no aclamado comic book «The secret Service», o filme conta a história dos Kingsman – uma organização super secreta de espiões – que recruta um vulgar, mas promissor, rapaz para um programa de treino ultra competitivo da sua agência, assim como uma ameaça global que surge de um desvirtuado génio das tecnologias.', 1);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Scary Movie', 'Um Susto de Filme', 2000, 'https://images.justwatch.com/poster/8711862/s592/todo-mundo-em-panico.webp', 'Das mentes dos criadores do seriado da TV americana "In living color" surge o primeiro thriller-comédia, em que adolescentes apavorados fugindo de maníacos assassinos são o pretexto para uma série de piadas envolvendo todos os recentes filme de terror, da série "Pânico" até "O sexto sentido", passando ainda por outros grandes sucessos do cinema, como "Matrix" e "Os suspeitos".', 1);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Matrix Resurrections', null, 2021, 'https://images.justwatch.com/poster/259270090/s592/the-matrix-resurrections.webp', 'Passaram vinte anos após os acontecimentos de "Matrix Revolutions". Neo leva uma vida aparentemente normal em São Francisco sob a sua identidade original de Thomas A. Anderson e frequenta um terapeuta que lhe prescreve comprimidos azuis para contrariar as estranhas memórias que ocasionalmente o atormentam. Também conhece uma mulher que parece ser Trinity, mas não se reconhecem um ao outro. Quando uma nova versão de Morpheus lhe oferece um comprimido vermelho, a mente de Neo reabre-se ao mundo da Matrix, que se tornou mais segura e perigosa nos anos decorridos desde a infecção Smith, e Neo volta a juntar-se a um grupo de rebeldes para lutar contra um novo inimigo.', 2);
INSERT INTO tb_movie(title, sub_title, year, img_url, synopsis, genre_id) 
	VALUES ('Dune', null, 2021, 'https://images.justwatch.com/poster/254529655/s592/dune.webp', 'Nesta viagem mítica e emocional, “Dune -Duna” conta a história de Paul Adreides, um jovem brilhante e talentoso com um grande destino para além da sua compreensão, que tem de viajar para o planeta mais perigoso do universo para garantir o futuro da sua família e do seu povo. Quando forças malévolas entram em conflito para obter uma quantidade exclusiva do recurso mais precioso do planeta –uma substância capaz de desbloquear o maior potencial da humanidade – apenas os que conquistam os seus medos conseguiram sobreviver.', 2);

INSERT INTO tb_review(text, movie_id, user_id) VALUES('Muito engraçado', 2, 1);
INSERT INTO tb_review(text, movie_id, user_id) VALUES('Parece filme de terror', 1, 1);
INSERT INTO tb_review(text, movie_id, user_id) VALUES('Clássico', 5, 1);
INSERT INTO tb_review(text, movie_id, user_id) VALUES('Filme mto legal!!', 6, 1);