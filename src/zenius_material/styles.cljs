(ns zenius-material.styles
  (:require [cljsjs.material-ui]
            [reagent.core :as r]))

(def colors (js->clj (aget js/MaterialUI "colors") :keywordize-keys true))

;; =============================================
;; helper fns

(defn ->colors [color level]
  (get-in colors [color level] #"000000"))

