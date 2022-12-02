insert into flowers (name, price)
values ('Rose', 100);

insert into flowers (name, price)
values ('Lily', 50);

insert into flowers (name, price)
values ('Сhamomile', 25);

insert into customers (name, telephone_number)
values ('Ivan', '+79030885464');

insert into customers (name, telephone_number)
values ('Sergey', '+79990000000');

insert into customers (name, telephone_number)
values ('Anna', '+79222222222');

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (1, 1, 11, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (1, 2, 25, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (2, 2, 101, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (2, 3, 45, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (3, 3, 35, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (3, 1, 55, now());

insert into orders (id_flower, id_customer, number_of_flowers, date_order)
values (1, 1, 11, now() - interval '30D');