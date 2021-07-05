# ui-cytoscape [![GitHub Actions status |pink-gorilla/ui-cytoscape](https://github.com/pink-gorilla/ui-cytoscape/workflows/CI/badge.svg)](https://github.com/pink-gorilla/ui-cytoscape/actions?workflow=CI)[![Clojars Project](https://img.shields.io/clojars/v/org.pinkgorilla/ui-cytoscape.svg)](https://clojars.org/org.pinkgorilla/ui-cytoscape)


; https://js.cytoscape.org/
; https://github.com/plotly/react-cytoscapejs

; other options:
; http://www.graphviz.org/
; geschichte


## Demo

```
clojure -X:goldly
```

Navigate your webbrowser to port 8000. 
Snippets are in `running systems` / `snippet-registry`

## In Goldly as a ui extension

In deps.edn add ui-cytoscape as dependency and add goldly alias

```
:goldly
  {:extra-deps {org.pinkgorilla/goldly {:mvn/version "RELEASE"}
               {org.pinkgorilla/ui-cytoscape {:mvn/version "0.0.2"}}
   :exec-fn goldly-server.app/goldly-server-run!
   :exec-args {:profile "watch"
               :config {:goldly {}}}}
```




