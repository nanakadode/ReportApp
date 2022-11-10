-- users table --
INSERT INTO users(username, password) VALUES('nana', 'nanana');
INSERT INTO users(username, password) VALUES('nini', 'ninini');
INSERT INTO users(username, password) VALUES('nunu', 'nununu');

-- report table --
INSERT INTO report(title, content, report_date, user_id) 
	VALUES('10/30 report', 'Java training', '2022-10-30', 1);
INSERT INTO report(title, content, report_date, user_id) 
	VALUES('11/1 report', 'Meeting with client', '2022-11-01', 2);

