use sakila;


-- 1ST QUESTION: Find out the number of documentaries with deleted scenes.

select count(*) from film, film_list 
where film.film_id =film_list.fid and film_list.category = "Documentary" and film.special_features like "%Deleted Scenes%";



-- 2ND QUESTION: Find out the number of sci-fi movies rented by the store managed by Jon Stephens.

select count(*) from film_list,inventory 
where film_list.category = "Sci-Fi" and inventory.film_id=film_list.fid and inventory.store_id in 
(select sid from staff_list 
where staff_list.name="Jon Stephens");



-- 3RD QUESTION: Find out the total sales from Animation movies.

select total_sales from sales_by_film_category 
where category="Animation";



-- 4TH QUESTION: Find out the top 3 rented category of movies by “PATRICIA JOHNSON”.

select film_list.category, count(film_list.category) as total 
from film_list,rental,inventory 
where film_list.fid = inventory.film_id and inventory.inventory_id = rental.inventory_id and rental.customer_id in 
(select customer_id from customer 
where customer.first_name = "PATRICIA" and customer.last_name= "JOHNSON") 
group by film_list.category 
order by total desc 
limit 3; 



-- 5TH QUESTION: Find out the number of R rated movies rented by “SUSAN WILSON”.

select count(*) from film_list,inventory 
where inventory.film_id = film_list.fid and film_list.rating = "R" and inventory.inventory_id in 
(select inventory_id from rental 
where customer_id = (select customer_id from customer 
where first_name = "SUSAN" and last_name = "WILSON"));


