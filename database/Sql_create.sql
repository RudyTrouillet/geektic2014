drop table geek IF exists cascade;
drop table interest IF exists cascade;
drop table geekInterest IF exists cascade;


create table geek (
id_geek decimal(4),
nom varchar(40),
prenom varchar(40),
mail varchar(40),
gravatar varchar(100),
sexe varchar(1),
compteur_passage smallint
);
          
create table interest (
id_interest decimal(4),
libelle varchar(40),
description varchar(100)
);


create table geekInterest (
id_geek decimal(4),
id_interest decimal(4)
);

alter table geek
add constraint pk_geek primary key (id_geek);

--alter table geek
--add constraint pk_sexe CHECK (sexe='H' or sexe='F');

alter table interest
add constraint pk_interest primary key (id_interest);

alter table geekInterest
add constraint fk_geek_geekInterest foreign key (id_geek) references geek (id_geek);

alter table geekinterest
add constraint pk_geekInterest primary key (id_geek, id_interest);   

alter table geekInterest
add constraint fk_interest_geekInterest foreign key (id_interest) references interest (id_interest);
		
		