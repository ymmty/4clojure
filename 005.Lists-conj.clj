;Lists: conjSolutions
;Difficulty:	Elementary
;Topics:	
;
;
;When operating on a list, the conj function will return a new list with one or more items "added" to the front.

'(1 2 3 4)

(= '(1 2 3 4) (conj '(2 3 4) 1))

(= '(1 2 3 4) (conj '(3 4) 2 1))