(ns personal-website.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :current-view
 (fn [db _]
   (:current-view db)))
