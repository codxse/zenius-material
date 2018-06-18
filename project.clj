(defproject zenius-material "0.1.1-SNAPSHOT"
  :description "A ClojureScript reagent wrapper for Material-UI v1.x"
  :url "https://github.com/codxse/zenius-material"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.238"]
                 [reagent "0.8.1" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/material-ui "1.0.0-beta.40-0"]
                 [cljs-react-material-ui "0.2.48"]])
