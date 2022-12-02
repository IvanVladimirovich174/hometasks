select orders.id_order,
       orders.date_order,
       flowers.name   as flower_name,
       orders.number_of_flowers,
       customers.name as customer_name,
       customers.telephone_number,
       customers.agreement_to_use_pd
from orders
         left join customers on customers.id_customer = orders.id_customer
         left join flowers on flowers.id_flower = orders.id_flower
where customers.id_customer = 2;