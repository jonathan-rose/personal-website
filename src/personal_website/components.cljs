(ns personal-website.components 
  (:require [re-frame.core :as re-frame]
            [clojure.string :as string]))

(defn make-link [link-name]
  (let [string-name (str (string/lower-case link-name))]
    [:a {:on-click #(re-frame/dispatch [:set-view string-name])} link-name]))

(defn sidebar []
  [:div.sidebar
   [:h1 "Jonathan Rose"]
   [:ul
    (make-link "Home")
    (make-link "About")
    (make-link "Contact")
    (make-link "Games")
    [:a {:href "https://www.github.com/jonathan-rose"} "Git Hub"]
    ]])