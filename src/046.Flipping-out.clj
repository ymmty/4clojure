;Flipping out
; 
;Difficulty:	Medium
;Topics:	higher-order-functions
;
;
;Write a higher-order function which flips the order of the arguments of an input function.

#(fn [a b] (% b a))

(= 3 ((#(fn [a b] (% b a)) nth) 2 [1 2 3 4 5]))

(= true ((#(fn [a b] (% b a)) >) 7 8))

(= 4 ((#(fn [a b] (% b a)) quot) 2 8))

(= [1 2 3] ((#(fn [a b] (% b a)) take) [1 2 3 4 5] 3))