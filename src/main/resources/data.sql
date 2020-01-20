INSERT INTO CATEGORY VALUES (1, 'MATH');
INSERT INTO DIFFICULTY VALUES (1, 'HARD');
INSERT INTO QUESTION VALUES (1, 'PRIMEIRA PERGUNTA', 1, 1);
INSERT INTO ALTERNATIVE (id, text, question_id, is_correct_alternative) VALUES (1, 'ALTERNATIVA 1', 1, FALSE);
INSERT INTO ALTERNATIVE (id, text, question_id, is_correct_alternative) VALUES (2, 'ALTERNATIVA 2', 1, FALSE);
INSERT INTO ALTERNATIVE (id, text, question_id, is_correct_alternative) VALUES (3, 'ALTERNATIVA 3', 1, FALSE);
INSERT INTO ALTERNATIVE (id, text, question_id, is_correct_alternative) VALUES (4, 'ALTERNATIVA 4', 1, TRUE);