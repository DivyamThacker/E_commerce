Create table IF NOT EXISTS todo (
    id INT PRIMARY KEY,
    description VARCHAR(255),
    done BOOLEAN,
    target_date DATE,
    username VARCHAR(50)
);

insert into todo (id, description, done, target_date,username)
values (10001, 'Learn AWS', false, CURRENT_DATE(), 'in28minutes');

insert into todo (id, description, done, target_date,username)
values (10002, 'Get AWS Certified', false, CURRENT_DATE(), 'in28minutes');

insert into todo (id, description, done, target_date,username)
values (10003, 'Learn DevOps', false, CURRENT_DATE(), 'in28minutes');