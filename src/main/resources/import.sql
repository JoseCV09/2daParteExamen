
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('josechacpa','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'José', 'Chacpa Vizcarra','josechacpa@upeu.edu.pe');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);

INSERT INTO bdexamenv3.categorias VALUES (0,'LACTEOS');
INSERT INTO bdexamenv3.categorias VALUES (0,'CARNE');

INSERT INTO bdexamenv3.productos VALUES (0,5,'LECHE GLORIA',3.20,1);
INSERT INTO bdexamenv3.productos VALUES (0,20,'BISTECK',6.00,2);

