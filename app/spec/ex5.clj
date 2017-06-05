(ns app.core-spec
  (:require [speclj.core :refer :all]
            [app.core :refer :all]))


(describe "===Ex5===")
(defn equi;; all sides are same 
  [s1 s2 s3]
  (if (= s1 s2 s3) true false))

(defn isoc ;;two sides are same 
  [s1 s2 s3]
  (if (or (= s1 s2 ) (= s1 s3) (= s2 s3) ) true false))

(defn scal ;;all sides are diff
  [s1 s2 s3]
  (if (not (or (= s1 s2 ) (= s1 s3 ) (= s2 s3) )) true false))

(defn classify
  [s1 s2 s3]
   (if (equi s1 s2 s3) "equi" 
     (if (scal s1 s2 s3) "scal" 
       (if (isoc s1 s2 s3) "isoc" )))) 

(describe "Triangle Kata"
(it "Can identify a isocelese triangle" 
    (should= true (isoc 2 2 1 )))

(it "Can identify a equilateral triangle"
     (should= true (equi 1 1 1 )))

(it "Can identify a scalene triangle"
     (should= true (scal 4 5 3)))

(it "can classify a equilateral triangle"
    (should= "equi" (classify 2 2 2)))

(it "can classify a scalene triangle"
    (should= "scal" (classify 2 4 5)))

(it "can classify a isocelese triangle"
    (should= "isoc" (classify 2 2 3)))
)

