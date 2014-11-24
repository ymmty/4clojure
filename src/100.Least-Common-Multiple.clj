;Least Common Multiple
; 
;Difficulty:	Easy
;Topics:	math
;
;
;Write a function which calculates the least common multiple. Your function should accept a variable ;number of positive integers or ratios. 
;
;(== (__ 2 3) 6)
;(== (__ 5 3 7) 105)
;(== (__ 1/3 2/5) 2)
;(== (__ 3/4 1/6) 3/2)
;(== (__ 7 5/7 2 3/5) 210)

(defn gcd [x y]
	(if (zero? (rem x y))
		y
		(gcd y (rem x y))))

(defn lcm [x y]
	(/ (* x y) (gcd x y)))

(fn [& args]
	(letfn [(gcd [x y]
		(let [a (max x y)
			  b (min x y)
			  m (rem a b)]
			(if (zero? m)
				b
				(recur b m))))
		(lcm [a b]
			(/ (* a b) (gcd a b)))]
	  (reduce lcm args)))


