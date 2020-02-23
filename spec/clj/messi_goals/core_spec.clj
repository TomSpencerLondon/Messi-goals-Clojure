(ns messi_goals.core-spec
  (:require [speclj.core :refer :all]
            [messi_goals.core :refer :all]))

(describe "A Clojure test"
          (it "adds (goals 0 0 0)"
              (should= (goals 0 0 0) 0)))(run-specs)
