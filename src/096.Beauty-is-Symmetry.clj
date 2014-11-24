;Beauty is Symmetry
; 
;Difficulty:	Easy
;Topics:	trees
;
;
;Let us define a binary tree as "symmetric" if the left half of the tree is the mirror image of the right ;half of the tree. Write a predicate to determine whether or not a given binary tree is symmetric. (see; To Tree, or not to Tree for a reminder on the tree representation we're using).

(fn [[root left right]]
	(letfn [(symme? [a b]
				(cond
					(not= (coll? a) (coll? b)) false
					(coll? a) (let [[ra La Ra] a
									[rb Lb Rb] b]
								(and (= ra rb) (symme? La Ra) (symme? Lb Rb)))
					:else (= a b)))]
		(symme? left right)))
