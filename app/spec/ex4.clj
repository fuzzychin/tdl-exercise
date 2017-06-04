(ns app.core-spec
  (:require [speclj.core :refer :all]
            [app.core :refer :all]))

(describe "===Ex 4===")
(describe "===Data Structures===")
(describe "Maps"
  (it "I can create a map using curly braces, and query it using 'get'"
   (should= "Bart" (get {:item1 "Homer" :item2 "Bart"} :item2)))
  
  (it "I can create a map of numbers and get the value of 'c'"
    (should= 55 (get {:a 99 :b 66 :c 55 :d 44} :c))))

(describe "Vectors"
  (it "Vectors are like arrays. I can use 'get' with index to get the value"
    (def names ["Marge" "Bart" "Homer" "Burns"])
    (should= "Homer" (get names 2 )))
  (it "Get the first element of a Vector"
    (def cities ["London" "New York" "Chicago" "Denver"]) 
    (should= "London" (get cities 0)))
  )
(describe "Lsts"
  (it "I create a list using parenthesis"
    (def my-list '(1 2 3))
    (should= 2 (nth my-list 1)))
  (it "I can also create a list using the 'list' function"
    (def my-list (list "homer" "marge" "bart"))
    (should= "marge" (nth my-list 1)))
  )
(describe "Sets"
  (it "I can create a list of unique values using the hash-set function"
      (def my-set (hash-set "homer" 1 1 "homer" "marge"))
      (should= true (contains? my-set "homer")))
  (it "if a set has a value i can 'get' it"
      (def my-set (hash-set 3 5 7 9 11))
      (should= 3 (get my-set 3))
      )
  (it "if a set doesnt have a value, 'get' returns nil" 
      (def my-set (hash-set 3 5 7 9 11))
      (should= nil (get my-set 4))
      ))
