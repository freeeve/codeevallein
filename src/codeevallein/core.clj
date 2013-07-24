(ns codeevallein.core
  (:gen-class))

(defn -main
  "Drop code to run in here, or make people submit a (defn -main ...) method."
  [& args]
  (loop [x 1]
    (println x)
    (if (< x 99) 
      (recur (+ 2 x))))
)
