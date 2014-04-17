(defproject fablo/api-client "unused"
  :main fablo.api-client-main
  :description "Fablo API client"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-json "0.5.3"]
                 [commons-io/commons-io "2.4"]
                 [commons-codec "1.9"]
                 [clj-http "0.9.1"]
                 [ring/ring-codec "1.0.0"]
                 [clojopts "0.3.2"]     ; move to tools.cli
                 [clj-time "0.6.0"]]
  :hooks [leiningen.hooks.git-version]
  :plugins [[lein-git-version "0.0.10"]])
