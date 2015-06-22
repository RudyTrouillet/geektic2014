DELETE FROM geek;
DELETE FROM interest;
DELETE FROM geekInterest;

INSERT INTO geek (id_geek,nom,prenom,mail,gravatar,sexe,compteur_passage) values
(0001,'Dupont','Pierre','Pierre.dupont@gmail.com','bidon','H',0)
,(0002,'Trautte','Margot','Margot.Trautte@hotmail.fr','bidon','F',0)

;


INSERT INTO interest (id_interest,libelle,description) values
(0001,'Java','blabla')
,(0002,'C#','blabla')
,(0003,'TDD','blabla')
,(0004,'JUnit','blabla')
,(0005,'PHP','blabla')

;



INSERT INTO geekInterest (id_geek,id_interest) values
(0001,0001)
,(001,002)

;
