(ns app.core-spec
  (:require [speclj.core :refer :all]
            [app.core :refer :all]))

(describe "ex2"
  (it "enviornment works"
    (should= 1 1)))

(describe "simple arithmetic"
 (it "2+2 is 4"
   (should= 4 (+ 2 2)))

 (it "2x4 is 8"
   (should= 8 (* 2 4)))

 (it "8/4 is 2"
   (should= 2 (/ 8 4))))

