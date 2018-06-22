(defproject zenius-material "0.1.1-1"
  :description "A ClojureScript reagent wrapper for Material-UI v1.x"
  :url "https://github.com/codxse/zenius-material"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.312"]
                 [reagent "0.8.1" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/material-ui "1.2.1-0"]
                 [cljs-react-material-ui "0.2.50"]])
