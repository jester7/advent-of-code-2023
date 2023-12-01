(ns util.file-utils
  (:require [clojure.java.io :as io]
            [util.constants :as c]))

(defn data-file
  "get full data file path"
  [day-num] (str c/data-dir day-num c/data-file-suffix))

(defn read-file-lines [file-name]
  (println "reading file: " file-name)
  (with-open [reader (io/reader file-name)]
    (vec (line-seq reader))))
