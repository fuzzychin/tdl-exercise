(ns app.core-spec
  (:require [speclj.core :refer :all]
            [app.core :refer :all]
            ))

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
  (defn odd
    [input]
    (if (= 1 (mod input 2))
      true
      false
    ))
  (it "a function with branching logic to determin odd/even" 
    (should= true (odd 3))
    (should= false (odd 4))))

(describe "Multi Arity Functions"
  (defn multi-airty 
   ([arg1]
    "one")
   ([arg1 arg2] 
    "two")
   ([arg1 arg2 arg3] 
    "three")) 
  (it "dpending on how many arguments are passed a different branch is executed"
    (should= "one" (multi-airty 1))
    (should= "two" (multi-airty 1 1))
    (should= "three" (multi-airty 1 1 1))))


(describe "Anonymous functions"
  (it "I can create an anonymous function to make a square of a num"
      (should= 4 ((fn [x] (* x x)) 2))))


