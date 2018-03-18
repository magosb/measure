(defproject measure "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "TODO"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/java.jdbc "0.7.5"]
                 [org.clojure/tools.logging "0.4.0"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.postgresql/postgresql "42.2.2"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.mchange/c3p0 "0.9.5.2"]
                 [ring/ring "1.6.3"]
                 [compojure "1.6.0"]
                 [cheshire "5.8.0"]
                 [environ "1.1.0"]
                 [hikari-cp "2.2.0"]
                 [ragtime "0.7.2"]]
  :main measure.main
  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"]
  :resource-paths ["src/main/resources"]
  :repl-options {:init-ns user}
  :profiles {:uberjar {:aot :all}
             :dev [:dev-common :dev-local]
             :dev-common {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                         [com.stuartsierra/component.repl "0.2.0"]]
                          :plugins [[lein-environ "1.1.0"]]
                          :source-paths ["dev"]}})