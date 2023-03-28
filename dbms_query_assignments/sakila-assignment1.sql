use sakila;


-- 1ST QUESTION:Find out the PG-13 rated comedy movies. DO NOT use the film_list table.

select * from film 
where rating = "PG-13" and film_id in 
( select film_id from film_category 
where category_id in 
(select category_id from category 
where name = "Comedy"));



-- 2ND QUESTION:Find out the top 3 rented horror movies.

select title,count(title) from film_list,inventory,rental 
where film_list.category = "Horror" and film_list.FID = inventory.film_id and inventory.inventory_id = rental.inventory_id 
group by title 
order by count(title) desc 
limit 3;



-- 3RD QUESTION: Find out the list of customers from India who have rented sports movies.

select * from customer_list 
where country="india" and id in 
(select rental.customer_id from rental,inventory,film_list 
where rental.inventory_id=inventory.inventory_id and inventory.film_id=film_list.fid and film_list.category='sports');



-- 4TH QUESTION:Find out the list of customers from Canada who have rented “NICK WAHLBERG” movies.

select * from customer_list 
where country="Canada" and id in 
(select rental.customer_id from rental,inventory,film_actor,actor 
where rental.inventory_id=inventory.inventory_id and inventory.film_id=film_actor.film_id and film_actor.actor_id = actor.actor_id and actor.first_name='Nick' and actor.last_name = "Wahlberg");



-- 5TH	QUESTION:Find out the number of movies in which “SEAN WILLIAMS” acted.

select count(*) from film_list 
where actors like "%SEAN WILLIAMS%";



