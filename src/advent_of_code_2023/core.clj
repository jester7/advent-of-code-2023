(ns advent-of-code-2023.core
  (:require [advent-of-code-2023.days.day1 :as d1]
            [advent-of-code-2023.util.file-utils :as f]))



(defn -main [& args]
  (let [day-num (if (and (> (count args) 0) (number? (first args)))
                  (first args)
                  1)
        file-name (if (nil? args)
                    (f/data-file (str "day" day-num))
                    (second args))]
    (case day-num
      1 (println (d1/part1 file-name)))))

