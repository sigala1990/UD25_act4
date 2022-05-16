DROP TABLE IF EXISTS salas;
DROP table IF EXISTS peliculas;


CREATE TABLE peliculas(
  codigo int AUTO_INCREMENT primary key,
  nombre nvarchar(100),
  calificacionedad int 
);


CREATE TABLE salas (
  codigo int AUTO_INCREMENT primary key,
  nombre nvarchar(100),
  pelicula_id int,
  CONSTRAINT pelicula_fk FOREIGN KEY (pelicula_id) REFERENCES peliculas(codigo)
);

INSERT INTO PELICULAS (nombre, calificacionedad) VALUES('terminator',18);
INSERT INTO PELICULAS (nombre, calificacionedad) VALUES('aladin',0);
INSERT INTO PELICULAS (nombre, calificacionedad) VALUES('spider',12);

INSERT INTO salas(nombre , pelicula_id) VALUES('sala1',1);
INSERT INTO salas(nombre , pelicula_id) VALUES('sala2',2);
INSERT INTO salas(nombre , pelicula_id) VALUES('sala3',3);


/*CREATE TABLE salas (
  codigo int AUTO_INCREMENT primary key,
  nombre varchar(100) DEFAULT NULL,
  pelicula_id int,
  key (pelicula_id),
  FOREIGN KEY (pelicula_id) REFERENCES peliculas(codigo)
);*/