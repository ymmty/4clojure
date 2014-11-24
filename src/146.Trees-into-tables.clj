;Trees into tables
; 
;Difficulty:	Easy
;Topics:	seqs maps
;
;
;Because Clojure's for macro allows you to "walk" over multiple sequences in a nested fashion, it is excellent for transforming all sorts of sequences. If you don't want a sequence ;as your final output (say you want a map), you are often still best-off using for, because you can produce a sequence and feed it into a map, for example.
;
;For this problem, your goal is to "flatten" a map of hashmaps. Each key in your output map should be the "path"1 that you would have to take in the original map to get to a value, ;so for example {1 {2 3}} should result in {[1 2] 3}. You only need to flatten one level of maps: if one of the values is a map, just leave it alone.
;
;1 That is, (get-in original [k1 k2]) should be the same as (get result [k1 k2])

(defn intomap [mp]
	(into {}
		(for [[k v] mp
			  [vk vv] v]
			(vec [[k vk] vv]))))

(= (intomap '{a {p 1, q 2}
         b {m 3, n 4}})
   '{[a p] 1, [a q] 2
     [b m] 3, [b n] 4})

(= (intomap '{[1] {a b c d}
         [2] {q r s t u v w x}})
   '{[[1] a] b, [[1] c] d,
     [[2] q] r, [[2] s] t,
     [[2] u] v, [[2] w] x})

(= (intomap '{m {1 [a b c] 3 nil}})
   '{[m 1] [a b c], [m 3] nil})

(let [x 1]
	x)

(let [c (+ 1 2)
	  [d e] [5 6]]
	(-> (+ d e) (- c)))

(let [a (take 5 (range))
	  {:or {d 10 b 20 c 30}} {a:c 50 :d 100}
	  [e f g & h] ["a" "b" "c" "d" "e"]
	  _ (println "I was here!")
	  foo 12
	  bar (+ foo 100)]
	[a b c d e f g h foo bar])

(let [[x y :as my-point] [5 3]]
	(println x y)
	(println my-point))

(let [[x y] [5 3]
	  my-point [x y]]
	(println x y)
	(println my-point))

(use 'clojure.walk)
(walk first reverse [[1 2] [3 4]])

