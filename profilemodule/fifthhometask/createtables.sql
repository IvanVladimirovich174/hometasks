create table flowers
(
    id_flower serial primary key,
    name      varchar(100) not null,
    price     integer      not null
);

create table customers
(
    id_customer         serial primary key,
    name                varchar(100) not null,
    telephone_number    varchar(50)  not null,
    agreement_to_use_pd boolean      not null default true
);

create table orders
(
    id_order          serial primary key,
    id_flower         integer references flowers   not null,
    id_customer       integer references customers not null,
    number_of_flowers integer check (number_of_flowers >= 1 and number_of_flowers <= 1000),
    date_order        date                         not null
);