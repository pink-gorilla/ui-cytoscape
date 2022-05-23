(ns ui.cytoscape
  (:require
   [re-frame.core :as rf]
   ["cytoscape" :as cytoscope]
   ["cytoscape-cose-bilkent" :as cose-bilkent]
   ["cytoscape-dagre" :as dagre]
   ["react-cytoscapejs" :as CytoscapeComponent]
   [pinkie.box :refer [apply-style]]))

(.use cytoscope cose-bilkent)
(.use cytoscope dagre);

(defn ^{:category :data}
  cytoscape
  [data]
  [:> CytoscapeComponent data])

(defn ^{:category :data}
  cytoscape-boxed
  ""
  [props]
  [cytoscape (apply-style props)])
