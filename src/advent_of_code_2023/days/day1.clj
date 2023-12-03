(ns advent-of-code-2023.days.day1
  (:require [advent-of-code-2023.util.file-utils :as f]))

(defn get-all-digits
  [line]
  (re-seq #"[\d]" line))

(defn calibration-value
  "gets first and last digits or doubles digit if only one"
  [digits] (let [first (first digits)
                 last (last digits)]
             (Integer/parseInt  (str first last))))

(defn part1
  ([file-name]
   (let [lines (f/read-file-lines file-name)]
     (reduce + (for [line lines]
                 (calibration-value (get-all-digits line)))))))
