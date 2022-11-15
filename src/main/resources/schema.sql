DROP TABLE IF EXISTS users;
CREATE TABLE users (
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(50) NOT NULL COMMENT 'User Name',
	password VARCHAR(50) NOT NULL COMMENT 'Password',
	email VARCHAR(50) NOT NULL COMMENT 'Email',
--	role VARCHAR(50) COMMENT 'Role',
--	enable_flag TINYINT(1) NOT NULL DEFAULT 1 COMMENT '1:True 0:False',
--	UNIQUE KEY(email),
	PRIMARY KEY (id)
);

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