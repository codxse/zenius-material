# Zenius Material

A ClojureScript reagent wrapper for Material-UI v1.x.

Current Material-UI version: 1.0.0-beta.40-0

## Usage

```clj
(ns my-namespace.core
  (:require [cljsjs.material-ui] ;; add this first
            [reagent.core :as r]
            [zenius-material.components :as ui]
            [zenius-material.icons :as ic]
            [zenius-material.styles :refer [->color]))
```

### Example

```clj

(r/render [:<>
           [ui/CssBaseLine]
           [ui/Button {:variant "raised"
                       :color "primary"
                       :style {:color (->color :yellow :300)}}
            "Hello from next MaterialUI"]
           [ui/Button {:variant "fab"
                       :color "secondary"}
            "+"]
           [ic/Lock]]
         (js/document.getElementById "app"))

```

## License

Copyright © 2018

Distributed under the Eclipse Public License either version 1.0.
