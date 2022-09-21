insert into Linguagem(nome) values ('Java');
insert into Linguagem(nome) values ('C#');
insert into Linguagem(nome) values ('Python');
insert into Linguagem(nome) values ('C++');

insert into Comando(sequencia, nome, id_linguagem) values (1, 'print', 1);

insert into Questao(texto_inicial, pergunta, id_linguagem) values ('texto inicial', 'tudo bem?', 1);

insert into PerguntaResposta(id) values (1);

insert into Alternativa(verdadeira, descricao, explicacao, id_pergunta_resposta) values (true, 'alternativa verdadeira', 'teste 1', 1);
insert into Alternativa(verdadeira, descricao, explicacao, id_pergunta_resposta) values (false, 'alternativa false', 'teste 2', 1);
insert into Alternativa(verdadeira, descricao, explicacao, id_pergunta_resposta) values (false, 'alternativa false 2', 'teste 3', 1);

insert into Modulo(nome) values ('Introdução');

insert into Licao(data, explicacao, id_modulo) values ('09-10-2022', 'hello world', 1);

insert into Licao_Questao(id_licao, id_questao) values (1, 1);