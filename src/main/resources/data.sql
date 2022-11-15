-- users table --
INSERT INTO users(username, email, password) VALUES('nana', 'nana@gmail.com', 'nanana');
INSERT INTO users(username, email, password) VALUES('nini', 'nini@gmail.com', 'ninini');
INSERT INTO users(username, email, password) VALUES('nunu', 'nunu@gmail.com', 'nununu');

-- report table --
INSERT INTO report(title, content, report_date, user_id) 
	VALUES('10/30日報', 'Java研修受講', '2022-10-30', 1);
INSERT INTO report(title, content, report_date, user_id) 
	VALUES('11/1日報', '職場見学実施', '2022-11-01', 2);

