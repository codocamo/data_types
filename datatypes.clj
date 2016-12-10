;;DATA TYPES DATA STRUCTURES


;;String
"this is a string"

;;Integer
1337

;;Float
3.7

;;Keyword
:this-is-a-keyword

;;Map
;;Maps are key pair values
{:first-name "future"
 :second-name, "me"}

;;here we associate keywords with with strings to make a key value pair
;;to get values out you can use the "get" function
(def my-map {:first-name "future" :second-name, "me"})
(get my-map :first-name)

;;the "get" function can be given a default value
(get my-map :third-name "Default value")

;;you can also get to values by using your map like a function and the key as an argument
(my-map :first-name)

;;if your map key is a keyword you can call that key word like a function and the map as an argument (this is a special property of key words, they can be called like functions)
(:first-name my-map)

;;to get in to nested maps yopu can use the "get-in" function and put the keys in a vector
(def my-map {:first-name {:name1 "presant" :name2 "current"} :second-name, "me"})
(get-in my-map [:first-name :name1])

;;you could essentially associate anything with anything else to make a key value pair
(def addition-map {"addition-function" +})
((get addition-map "addition-function") 10 20)


;;Vector
;;Vectors are 0 indexed sequences
[1 3 5 8]

;;to get values you can use the "get" function
(def my-vector [1 2 6 4 5])
(get my-vector 4)

;;you can also get to values by using your vector like a function and the index as an argument
(my-vector 4)

;;vectors can contain anything here we have a string, keyword, vector, map, int, float
(def my-vector ["string" :keyword [3 6] {:key "value"} 32 4.5 +])

(get my-vector 0)
(get my-vector 1)
(get my-vector 2)
(get my-vector 3)
(get my-vector 4)
(get my-vector 5)
(get my-vector 6)


;;List
;;lists are 0 indexed sequences
'(1 5 7 8)

(def my-list '("string" :keyword [3 6] {:key "value"} 32 4.5 +))

(nth my-list 3)

;;Hash set
#{}


;;conj
;vector
;list


;;get/get-in
;map
;vectors
;hash-set

;;nth
;lists


