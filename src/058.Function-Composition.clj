;Function Composition
; 
;Difficulty:	Medium
;Topics:	higher-order-functions core-functions
;
;
;Write a function which allows you to create function compositions. The parameter list should take a variable number of functions, and create a function applies them from right-to-left.

(defn comb [& funcs]
	(fn [& args]
		(first
			(reduce #(vector (apply %2 %1)) args (reverse funcs)))))

(= [3 2 1] ((comb rest reverse) [1 2 3 4]))

(= 5 ((comb (partial + 3) second) [1 2 3 4]))

(= true ((comb zero? #(mod % 8) +) 3 5 7 9))

(= "HELLO" ((comb #(.toUpperCase %) #(apply str %) take) 5 "hello world"))