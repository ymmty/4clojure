;Pascal's Trapezoid
; 
;Difficulty:	Easy
;Topics:	seqs
;
;
;Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of ;vectors, where each next one is constructed from the previous following the rules used in Pascal's ;Triangle. For example, for [3 1 2], the next row is [3 4 3 2].
;

(fn pascal [x]
	(iterate (fn [s]
		(concat (list (first s)) (map +' s (rest s) ) (list (last s)))) x))

(fn pascal [s]
	(lazy-seq
		(cons s
			(pascal (map #(+' (first %) (second %)) (partition 2 1 (conj (vec (cons 0 s)) 0)))))))

(= (second (pascal [2 3 2])) [2 5 5 2])
(= (take 5 (pascal [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
(= (take 2 (pascal [3 1 2])) [[3 1 2] [3 4 3 2]])
(= (take 100 (pascal [2 4 2])) (rest (take 101 (pascal [2 2]))))