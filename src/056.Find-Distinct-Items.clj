;Find Distinct Items
; 
;Difficulty:	Medium
;Topics:	seqs core-functions
;
;
;Write a function which removes the duplicates from a sequence. Order of the items must be maintained.

(defn fdi [seq]
	(reduce (fn [s e]
		(if (some #(= % e) s)
			s
			(conj s e))) [] seq))

(= (fdi [1 2 1 3 1 2 4]) [1 2 3 4])

(= (fdi [:a :a :b :b :c :c]) [:a :b :c])

(= (fdi '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= (fdi (range 50)) (range 50))