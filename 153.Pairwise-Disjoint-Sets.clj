;Pairwise Disjoint Sets
; 
;Difficulty:	Easy
;Topics:	set-theory
;
;
;Given a set of sets, create a function which returns true if no two of those sets have any elements in common1 and false otherwise. Some of the test cases are a bit tricky, so pay a ;little more attention to them.
;
;1Such sets are usually called pairwise disjoint or mutually disjoint.

(defn disjoint? [sets]
	(apply distinct? (mapcat seq sets)))

(disjoint? #{#{:a :b :c :d :e}
         #{:a :b :c :d}
         #{:a :b :c}
         #{:a :b}
         #{:a}})

(disjoint? #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
(#(apply distinct? (mapcat seq %)) #{#{:a :b :c :d :e}
         #{:a :b :c :d}
         #{:a :b :c}
         #{:a :b}
         #{:a}})
#(apply distinct? (mapcat seq %))         	