CREATE SCHEMA security;

CREATE SEQUENCE role_seq
START 1
INCREMENT 1;

create table security.roles(
    role_id int8 primary key not null DEFAULT nextVal('role_seq'),
    role_name CHARACTER VARYING(20) not null unique,
    created_by CHARACTER VARYING(50),
    created_date TIMESTAMP not null
);

create table security.users(
user_id CHARACTER VARYING(64) not null PRIMARY KEY,
username CHARACTER VARYING(150) not null UNIQUE,
password CHARACTER VARYING(255) not null,
is_active BOOLEAN not null,
created_by CHARACTER VARYING(50),
created_date TIMESTAMP not null
);

create table security.user_roles(
user_id CHARACTER VARYING(64) NOT NULL REFERENCES security.users(user_id),
role_id int8                NOT NULL REFERENCES security.roles(role_id)
);



