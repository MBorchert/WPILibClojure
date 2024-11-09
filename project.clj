(defproject default "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [edu.wpi.first/GradleRIO "2024.3.2"]]
  :repositories [["jfrog" "https://frcmaven.wpi.edu/ui/native/release/"]]
  :source-paths ["src/main/clojure"]
  :aot :all
  :main frc.robot.foo)
