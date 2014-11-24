;Sequence Reductions
; 
;Difficulty:	Medium
;Topics:	seqs core-functions
;
;
;Write a function which behaves like reduce, but returns each intermediate value of the reduction. ;Your function must accept either two or three arguments, and the return sequence must be lazy.

(defn my-reduce
  ([op input] (my-reduce op (first input) (rest input)))
  ([op result input]
  (lazy-seq
    (if (empty? input) (list result)
      (cons result
            (my-reduce op
                 (op result (first input))
                 (rest input)))))))

(= (take 5 (my-reduce + (range))) [0 1 3 6 10])

(= (__ conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)