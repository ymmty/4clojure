;Rotate Sequence
; 
;Difficulty:	Medium
;Topics:	seqs
;
;
;Write a function which can rotate a sequence in either direction.

(defn rotate [n xs]
	(let [length (count xs)
		  n* (mod n length)]
		(concat (drop n* xs) (take n* xs))))

(defn rotate [n x]
	(take (count x)
		  (drop (mod n (count x))
		  		(cycle x))))

(defn rotate [n seq]
	(let [k (mod n (count seq))]
		(concat (drop k seq) (take k seq))))

(defn rotate [n s]
	(let [[l r] (split-at (mod n (count s)) s)]
		(concat r l)))

(= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (rotate 1 '(:a :b :c)) '(:b :c :a))

(= (rotate -4 '(:a :b :c)) '(:c :a :b))