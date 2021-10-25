drop table if exists artist CASCADE;
drop table if exists song CASCADE;
drop table if exists playlist CASCADE;
drop table if exists addedTo CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table song (id bigint not null, title varchar(255), artist_id bigint, album varchar(255), year varchar(255), primary key (id));
create table artist (id bigint not null, name varchar(255), primary key (id));
create table playlist (id bigint not null, name varchar(255), description varchar(255), primary key (id));
create table addedTo (id bigint not null, datetime date, order int, primary key (id));
alter table song add constraint FKojks48ahsqwkx9o2s7pl0212p foreign key (artist_id) references artist;
alter table song add constraint DHAKAShahsjhdajahsuruhuehx8 foreign key (addedTo_id) references addedTo;
alter table playlist add constraint uajsbduewbqbdasj27347 foreign key (addedTo_id) references addedTo;
