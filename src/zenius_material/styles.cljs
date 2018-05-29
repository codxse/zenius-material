(ns zenius-material.styles
  (:require [cljsjs.material-ui]
            [reagent.core :as r]))

(def colors (js->clj (aget js/MaterialUI "colors") :keywordize-keys true))

;; =============================================
;; helper fns

(defn color [color_ level_]
  (get-in colors [color_ level_] "#000000"))

