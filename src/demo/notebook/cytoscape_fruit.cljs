(ns demo.notebook.cytoscape-fruit
  (:require
   [ui.cytoscape :refer [cytoscape]]))

^:R
[cytoscape
 {:box :sm
  :stylesheet [{:selector "node"
                :style {:label "data(label)"}}]
  :elements [{:data {:id "a" :label "apple"} :position {:x 0 :y 0}}
             {:data {:id "b" :label "banana"} :position {:x 100 :y 0}}
             {:data {:id "c" :label "cherry"} :position {:x 200 :y 0}}]
  :layout {:name "preset"}}]


