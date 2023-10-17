DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS employee;

CREATE TABLE product (
	product_id serial,
	product_name varchar,
	price decimal(12,2),
	constraint pk_product PRIMARY KEY (product_id)
);

INSERT INTO product (product_name, price) VALUES ('Mug', 15.00);
INSERT INTO product (product_name, price) VALUES ('Shirt', 20.00);

CREATE TABLE employee (
	employee_id serial,
	employee_name varchar,
	title varchar,
	constraint pk_employee PRIMARY KEY (employee_id)
);

INSERT INTO employee(employee_name, title) VALUES('Bob', 'Marketing Analyst');
INSERT INTO employee(employee_name, title) VALUES('Carly', 'Software Engineer');

CREATE TABLE project(
	project_id SERIAL,
	project_name varchar,
	constraint pk_project PRIMARY KEY (project_id)
);

INSERT INTO project (project_name) VALUES ('Dim Supernova');

CREATE TABLE employee_project(
	employee_id int NOT NULL,
	project_id int NOT NULL,
	CONSTRAINT pk_employee_project PRIMARY KEY(employee_id, project_id),
	CONSTRAINT fk_employee_projects_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
	CONSTRAINT fk_employees_projects_project FOREIGN KEY (project_id) REFERENCES project(project_id)
);