select *
from orders
where orders.id_customer = 1
  and extract(year from orders.date_order) = extract(year from now())
  and extract(month from orders.date_order) = extract(month from now());