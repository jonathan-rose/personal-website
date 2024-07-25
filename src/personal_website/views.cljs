(ns personal-website.views
  (:require
   [re-frame.core :as re-frame]
   [personal-website.subs :as subs]
   [personal-website.components :as comps]
   ))

(defn home []
  [:div#home
   [:h1 "Hello, I'm Jon"]])
 
(defn about []
   [:p "About page"])
 
(defn contact []
   [:p "Contact page"])
 
(defn games []
   [:p "Games page"])

(defn main []
  (let [current-view @(re-frame/subscribe [:current-view])]
    [:div#main
     [comps/sidebar]
     [:div.main-content (case current-view
                          "home" [home]
                          "about" [about]
                          "contact" [contact]
                          "games" [games]
                          [home])]]))
