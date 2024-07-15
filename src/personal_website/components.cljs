(ns personal-website.components 
  (:require [re-frame.core :as re-frame]))

(defn sidebar []
  [:div
   [:ul
    [:a {:on-click #(re-frame/dispatch [:set-view "home"])} "Home"]
    [:a {:on-click #(re-frame/dispatch [:set-view "about"])} "About Me"]
    [:a {:on-click #(re-frame/dispatch [:set-view "contact"])} "Contact"]
    [:a {:on-click #(re-frame/dispatch [:set-view "games"])} "Games"]
    [:a {:href "https://www.github.com/jonathan-rose"} "Git Hub"]
    ]])

(defn home []
  [:p "Home page"]
  )

(defn about []
  [:p "About page"]
  )