(ns app.core-spec
  (:require [speclj.core :refer :all]
            [app.core :refer :all]
            [clojure.string :refer :all]))

(def my-func
  "Foo")

(describe "A named function"
  (it "can call a named function"
    (should= "Foo" my-func  )))

(describe "Another named function"
  (def some-func 2)
  (it "can call a named function that returns the value 2"
    (should= 2 some-func  )))

(describe "Passing Parameters to functions using defn"
  (defn square-func 
    [x] 
    (* x x )) 
  (it "takes a number parameter and returns its square"
    (should= 4 (square-func 2))))

(describe "Branching logic"
(it "a function with branching logic to determin odd/even" 
    (defn odd
      [input]
      (if (= 1 (mod input 2))
        true
        false
      ))
    (should= true (odd 3))
    (should= false (odd 4))))
