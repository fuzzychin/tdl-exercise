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
  (it "can call a named function that returns the value 2"
    (should= 2 some-func  )))

(describe "Passing Parameters to functions using defn"
  (defn square-func ) 
  (it "takes a number parameter and returns its square"
    (should= 4 (square-func 2))))

