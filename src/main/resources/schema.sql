CREATE TABLE report (
	id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(200) NOT NULL,
	report_date DATETIME NOT NULL,
	PRIMARY KEY (id)
);