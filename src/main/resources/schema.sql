CREATE TABLE IF NOT EXISTS activity
(
id   int NOT NULL AUTO_INCREMENT,
name VARCHAR(50),
PRIMARY KEY (ID)
);

INSERT IGNORE INTO activity(id, name)
values (1, 'Sprint Review'),
(2, 'Sprint Retrospective'),
(3, 'Sprint Planing');

CREATE TABLE IF NOT EXISTS project
(
id   int NOT NULL AUTO_INCREMENT,
name VARCHAR(50),
PRIMARY KEY (ID)
);

INSERT IGNORE INTO project(id, name)
values (1, 'SiMa VDP');

CREATE TABLE IF NOT EXISTS team
(
id         int NOT NULL AUTO_INCREMENT,
name       VARCHAR(50),
project_id int,
PRIMARY KEY (id),
FOREIGN KEY (project_id) REFERENCES project (id)
);

INSERT IGNORE INTO team(id, name, project_id)
VALUES (1, 'UI/UX', 1),
(2, 'DevOps', 1),
(3, 'FrontEnd', 1),
(4, 'BackEnd', 1);

CREATE TABLE IF NOT EXISTS team_mate
(
id         int NOT NULL AUTO_INCREMENT,
first_name       VARCHAR(50),
second_name VARCHAR(50),
team_id int,
activity_id int,
PRIMARY KEY (id),
FOREIGN KEY (team_id) REFERENCES team (id),
FOREIGN KEY (activity_id) REFERENCES activity (id)
);

INSERT IGNORE INTO team_mate(id, first_name, second_name, team_id, activity_id)
VALUES (1, 'Yana','Bezuhlova', 1, 1),
(2, 'Khrysyna', 'Maksymenko', 1, null),
(3, 'Yevhen', 'Kozohlodiuk', 2, 2),
(4, 'Vladyslav', 'Bobrovkyi', 2, null ),
(5, 'Verinika', 'Nebesna', 3, null),
(6, 'Vadym', 'Korobka', 3, null),
(7, 'Volodymyr', 'Voisovych',4, 3);