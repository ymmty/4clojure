;Re-implement MapSolutions
;Difficulty:	Easy
;Topics:	core-seqs
;
;
;Map is one of the core elements of a functional programming language. Given a function f and an input sequence s, return a lazy sequence of (f x) for each element x in s.
;
;Special Restrictions
;map
;map-indexed
;mapcat
;for

(defn iter [f x]
	(if (not (empty? x))
		(lazy-seq
			(cons (f (first x)) (iter f (rest x))))))

(= [3 4 5 6 7]
   (iter inc [2 3 4 5 6]))

(= (repeat 10 nil)
   (iter (fn [_] nil) (range 10)))

(= [1000000 1000001]
   (->> (iter inc (range))
        (drop (dec 1000000))
        (take 2)))