INSERT INTO p_users (id, login, name, password)
  SELECT 1,'sitnikov','Artem','sitnikov'
  WHERE NOT EXISTS ( SELECT id FROM p_users WHERE login='sitnikov' and password ='sitnikov' );

INSERT INTO p_users (id, login, name, password)
  SELECT 2,'tombasov','Yuri','tombasov'
  WHERE NOT EXISTS ( SELECT id FROM p_users WHERE login='tombasov' and password ='tombasov' );