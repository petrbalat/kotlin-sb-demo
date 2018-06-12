drop table if exists kotlin_meetup ;

create table kotlin_meetup(
 id int auto_increment,

 name varchar (255),

 start timestamp not null
);

insert into kotlin_meetup (name, start) values ('First', current_timestamp );
insert into kotlin_meetup (name, start) values (null, current_timestamp );