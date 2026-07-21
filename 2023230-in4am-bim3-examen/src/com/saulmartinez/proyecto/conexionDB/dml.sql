USE control_users;

# CRUDS

#CREATE
DELIMITER $$
CREATE PROCEDURE sp_create_user(IN p_username VARCHAR(100),IN p_nombres VARCHAR(50),IN p_apellidos VARCHAR(100),
    IN p_correo VARCHAR(50),
    IN p_clave VARCHAR(100))
BEGIN
    INSERT INTO users (username, nombres, apellidos, correo, clave)
    VALUES (p_username, p_nombres, p_apellidos, p_correo, p_clave);
END $$
DELIMITER ;

#READ
DELIMITER $$
CREATE PROCEDURE sp_read_users()
BEGIN
    SELECT id_user, username, nombres, apellidos, correo 
    FROM users;
END $$
DELIMITER ;

#VALIDAR LOGIN
DELIMITER $$
CREATE PROCEDURE sp_validar_login(IN p_username VARCHAR(100), IN p_clave VARCHAR(100)
)
BEGIN
    SELECT id_user, username, nombres, apellidos, correo 
    FROM users 
    WHERE username = p_username AND clave = p_clave;
END $$
DELIMITER ;