;Word Sorting
; 
;Difficulty:	Medium
;Topics:	sorting
;
;
;Write a function that splits a sentence up into a sorted list of words. Capitalization should not affect sort order and punctuation should be ignored.

(= (test "Have a nice day.")

(defn test [s]
	(clojure.string/split s #"\s+"))

