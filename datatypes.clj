;;Map
;;Maps are key pair values
{:first-name "future"
 :second-name, "me"}

;;here we associate keywords with with strings to make a key value pair
;;to get values out you can use the "get" function
(def my-map {:first-name "future" :second-name, "me"})
(get my-map :first-name)

;;you can also get to values by using your map like a function and the key as an argument
(my-map :first-name)

;;to get in to nested maps yopu can use the "get-in" function and put the keys in a vector
(def my-map {:first-name {:name1 "presant" :name2 "current"} :second-name, "me"})
(get-in my-map [:first-name :name1])

;;you could essentially associate anything with anything else to make a key value pair
