;Count Occurrences
; 
;Difficulty:	Medium
;Topics:	seqs core-functions
;
;
;Write a function which returns a map containing the number of occurences of each distinct item in a sequence.

(defn count-occ [s]
	(into {} (map (fn [[k v]] [k (count v)]) (group-by identity s))))

(= (count-occ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= (count-occ [:b :a :b :a :b]) {:a 2, :b 3})

(= (count-occ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})