(ns demo.page
  (:require
   [demo.fruit :refer [demo-fruit]]
   [demo.tree :refer [demo-tree]]
   [demo.node-pair :refer [demo-node-pair]]
   [demo.entanglement :refer [demo-entanglement]]))

(defn page [{:keys [route-params query-params handler] :as route}]
  [:div
   [:h1 "fruit "]
   [demo-fruit]
   [:h1 "tree"]
   [demo-tree]
   [:h1 "node pair"]
   [demo-node-pair]
   [:h1 "entanglement"]
   [demo-entanglement]])
