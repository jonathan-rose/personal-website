(ns personal-website.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re-frame]
   [personal-website.events :as events]
   [personal-website.views :as views]
   [personal-website.config :as config]
   ))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [views/main] root-el)))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (re-frame/dispatch [:set-view "home"])
  (dev-setup)
  (mount-root))