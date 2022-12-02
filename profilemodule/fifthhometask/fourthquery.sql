select sum(orders.number_of_flowers * flowers.price) as total_revenue
from orders
         left join flowers on orders.id_flower = flowers.id_flower;