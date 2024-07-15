(ns personal-website.events
  (:require
   [re-frame.core :as re-frame]
   [personal-website.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-view
 (fn [db [_ view]]
   (assoc db :current-view view)))

