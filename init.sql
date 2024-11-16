DROP TABLE IF EXISTS task;
CREATE TABLE task(id SERIAL PRIMARY KEY, name VARCHAR(50), description VARCHAR(50), priority VARCHAR(50));

INSERT INTO task (name, description, priority) VALUES ('Уборка', 'прибраться дома', 'Low');
INSERT INTO task (name, description, priority) VALUES ('Контейниризоваться', 'собраться и запустиься в докер-конейнере', 'Medium');
INSERT INTO task (name, description, priority) VALUES ('Спать', 'Выспаться перед тяжелым днём', 'High');