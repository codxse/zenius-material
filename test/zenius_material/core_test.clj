(ns zenius-material.core-test
  (:require [clojure.test :refer :all]
            [clojure.string :as string]))

(defn exstract [colls]
  (let [raw1 (apply str (drop 20 colls))]
    (first (string/split raw1 #" |,"))))

(def raw-js-omponents (slurp "https://raw.githubusercontent.com/mui-org/material-ui/master/packages/material-ui/src/index.js"))
(def raw-js-icons (slurp "https://raw.githubusercontent.com/mui-org/material-ui/master/packages/material-ui-icons/src/index.js"))

(def component-names
  (->> (for [name (->> (string/split raw-js-omponents #"\n")
                       (filter #(string/starts-with? % "e")))]
         (exstract name))
       (filter not-empty)
       (cons "ModalManager")))

(def icon-names
  (->> (for [name (->> (string/split raw-js-icons #"\n")
                       (filter #(string/starts-with? % "e")))]
         (exstract name))
       (filter not-empty)))

(doseq [name component-names]
  (println (str "(def " name " (r/adapt-react-class (aget js/MaterialUI \""name"\")))")))

(doseq [name icon-names]
  (println (str "(def " name " (r/adapt-react-class (aget js/MaterialUISvgIcons \""name"\")))")))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))
