(ns messi_goals.core)
(defn goals [la-liga-goals
             copa-del-rey-goals
             champions-league-goals]
(+ la-liga-goals copa-del-rey-goals champions-league-goals)
)
