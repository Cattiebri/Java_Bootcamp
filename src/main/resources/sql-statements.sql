create schema db;
DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher (
id INT Auto_Increment,
firstName varchar(100) NOT NULL,
lastName varchar(100) NOT NULL,
age INT,
PRIMARY KEY(id)
);
SELECT * FROM Teacher;
INSERT INTO Teacher (firstName, lastName, age)
VALUES ("John", "Doe", 36);

INSERT INTO Teacher (firstName, lastName, age)
VALUES ("Jane", "Doe", 32);

INSERT INTO Teacher (id, firstName, lastName, age)
VALUES (900, "Mary", "Boo", 67);

INSERT INTO Teacher (id, firstName, lastName, age)
VALUES (901, "Steve", "Wallace", 54);

UPDATE Teacher
SET lastName = "Parker"
WHERE id=900;

UPDATE Teacher
SET firstName = "Steven"
WHERE id=901;

ALTER TABLE Teacher DROP COLUMN age;

SELECT * FROM Teacher;
