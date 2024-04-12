(ns ui.cytoscape
  (:require
   ["cytoscape" :as cytoscope]
   ["cytoscape-cose-bilkent" :as cose-bilkent]
   ["cytoscape-dagre" :as dagre]
   ["react-cytoscapejs" :as CytoscapeComponent]
   [pinkie.ui.core :refer [apply-box-style]]))

(.use cytoscope cose-bilkent)
(.use cytoscope dagre);

(defn cytoscape
  [data]
  [:> CytoscapeComponent data])

(defn cytoscape-boxed
  ""
  [props]
  [cytoscape (apply-box-style props)])
