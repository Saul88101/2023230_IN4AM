drop database if exists control_users;
CREATE DATABASE control_users;
USE control_users;

CREATE TABLE users (
	id_user int PRIMARY KEY,
	username varchar(100) UNIQUE NOT NULL,
    nombres varchar(50) NOT NULL,
    apellidos varchar(100) NOT NULL,
    correo varchar(50) NOT NULL,
    clave varchar(100) NOT NULL
);