(ns personal-website.views
  (:require
   [re-frame.core :as re-frame]
   [personal-website.subs :as subs]
   [personal-website.components :as comps]
   ))

(defn main-panel []
  (let [current-view @(re-frame/subscribe [:current-view])]
    [:div 
     [comps/sidebar]
     (case current-view
       "home" [comps/home]
       "about" [comps/about]
       [comps/home])
     [:h1
      "Hello from " current-view]
     ]))
