(defproject mailing "1.0.0-SNAPSHOT"

  ;; Usage:
  ;; ------
  ;;
  ;; Set the environment variables USERNAME and ACCESS_TOKEN and then run
  ;; the project via `lein run`.
  ;;
  ;; Please see the `README.md` file for further information.

  ;; Basic project description and licensing terms
  :description "Test project to demonstrate clojure-mail usage scenarios"
  :url "http://service.tamanguu.com"
  :license {:name "Commercial, proprietary license"
            :url  "http://www.tamanguu.de/legal/license.html"}

  ;; Dependencies, please reload the entire environment after changes here
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.1.0"]
                 [io.forward/clojure-mail "1.0.7"]]
  :main ^:skip-aot mailing.core

  ;; File paths
  :target-path "target/%s")
