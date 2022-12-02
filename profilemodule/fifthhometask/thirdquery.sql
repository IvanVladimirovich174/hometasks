select flowers.name             as flower_name,
       orders.number_of_flowers as max_number_of_flowers
from flowers
         inner join orders on flowers.id_flower = orders.id_flower
where orders.number_of_flowers = (select max(orders.number_of_flowers) from orders);