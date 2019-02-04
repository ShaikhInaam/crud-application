drop table user if exists;
create table user (
       id integer not null,
        contact_number varchar(255),
        date timestamp,
        name varchar(255)
    );