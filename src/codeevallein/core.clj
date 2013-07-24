(ns codeevallein.core)

(import 'java.io.File)

(defn -main
  [& args]
  (println (.length (File. (nth args 0))))
)
