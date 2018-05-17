(ns mailing.core
  (:gen-class)
  (:require [environ.core :refer [env]]
            [clojure-mail.core :refer :all]
            [clojure-mail.message :refer [read-message flags]]))

;; region Main program, illustrating the major use cases

(defn -main
  "Demonstrate key use cases for accessing a Gmail account."
  [& _]

  ; Set up the Gmail store and retrieve test mails
  (let [gstore         (xoauth2-store "imap.gmail.com" (env :username) (env :access-token))
        inbox-messages (inbox gstore)
        latest         (read-message (first inbox-messages))
        latest-flags   (flags (first inbox-messages))]

    ; Report test mails to user
    (println "Store:" gstore)
    (println "Number of messages:" (count inbox-messages))
    (println "Latest message:")
    (println "  From:" (:from latest))
    (println "  To:" (:to latest))
    (println "  Cc:" (:cc latest))
    (println "  Subject:" (:subject latest))
    (println "  System/user flags:" (vec (.getSystemFlags latest-flags)) "/" (vec (.getUserFlags latest-flags)))

    ; Perform a custom search, notice how search clauses have an "or" rule
    (let [search-results (search-inbox gstore [:to "wolframschroers@googlemail.com" :from "wolfram.schroers@googlemail.com"])]
      (println "Search results:" (count search-results)))

    ; Recover the full list of folders
    (let [gmail-folders (folders gstore)]
      (println "All folders:" (pr-str gmail-folders) "/" (count gmail-folders)))))

;; endregion
