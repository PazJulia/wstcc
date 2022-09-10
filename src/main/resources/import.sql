insert into Linguagem(id, nome) values (nextval('hibernate_sequence'), 'Java');
insert into Linguagem(id, nome) values (nextval('hibernate_sequence'), 'C#');
insert into Linguagem(id, nome) values (nextval('hibernate_sequence'), 'Python');
insert into Linguagem(id, nome) values (nextval('hibernate_sequence'), 'C++');

insert into Comando(id, sequencia, nome, id_linguagem) values (nextval('hibernate_sequence'), '1', 'print', 1);