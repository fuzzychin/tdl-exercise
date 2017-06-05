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
   (equi s1 s2 s3) )

(describe "Triangle Kata"
(it "Can identify a isocelese triangle" 
    (should= true (isoc 2 2 1 )))

(it "Can identify a equilateral triangle"
     (should= true (equi 1 1 1 )))

(it "Can identify a scalene triangle"
     (should= true (scal 4 5 3))))

