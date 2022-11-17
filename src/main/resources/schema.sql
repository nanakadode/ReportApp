-- DROP TABLE IF EXISTS roles;
--CREATE TABLE roles (
--	id INT,
--	name VARCHAR(32) NOT NULL,
--	PRIMARY KEY (id)
--);


DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL COMMENT 'Email',
	password VARCHAR(50) NOT NULL COMMENT 'Password',
	PRIMARY KEY (id)
);


--DROP TABLE IF EXISTS user_role;
--CREATE TABLE user_role (
--	user_id INT,
--	role_id INT,
--	CONSTRAINT pk_user_role PRIMARY KEY (user_id, role_id),
--	CONSTRAINT fk_user_role_user_id FOREIGN KEY (user_id) REFERENCES login_user(id),
--	CONSTRAINT fk_user_role_user_id FOREIGN KEY (role_id) REFERENCES roles(id)
--);


DROP TABLE IF EXISTS report;
CREATE TABLE report (
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(200) NOT NULL,
	report_date DATETIME NOT NULL,
	user_id INT,
	PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES users(id)	
);