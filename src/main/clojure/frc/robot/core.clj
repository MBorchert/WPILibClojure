(ns frc.robot.core
  (:import [edu.wpi.first.wpilibj RobotBase TimedRobot])
  (:gen-class))

(defn make-robot
  []
  (proxy [TimedRobot] []
    (robotInit [] (println "yay"))
    (robotPeriodic [] (println "yay"))
    (autonomousInit [] (println "yay"))
    (autonomousPeriodic [] (println "yay"))
    (teleopInit [] (println "yay"))
    (teleopPeriodic [] (println "yay"))))