(ns demo.notebook.cytoscape-node-pair
  (:require
   [ui.cytoscape :refer [cytoscape]]))

^:R
[cytoscape
 {:stylesheet [{:selector "node"
                :style {:width 20
                        :height 20
                        :shape "rectangle"}}
               {:selector "edge"
                :style {:width 15}}]
  :elements [{:data {:id "one" :label "Node 1"} :position {:x 0 :y 0}}
             {:data {:id "two" :label "Node 2"} :position {:x 100 :y 0}}
             {:data {:source "one" :target "two" :label "Edge from Node1 to Node2"}}]
  :layout {:name "random"}}]


