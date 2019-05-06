insert into user (id, birth_date, name) values (10001, sysdate(), 'Juan');
insert into user (id, birth_date, name) values (10002, sysdate(), 'Pedro');
insert into user (id, birth_date, name) values (10003, sysdate(), 'María');

insert into post (id, description, user_id) values (11001, 'My first post', 10001);
insert into post (id, description, user_id) values (11002, 'My second post', 10001);