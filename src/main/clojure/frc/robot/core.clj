(ns frc.robot.core
  (:import [edu.wpi.first.wpilibj TimedRobot])
  (:import [edu.wpi.first.wpilibj2.command Command CommandScheduler])
  (:gen-class))

(defn make-robot
  []
  (proxy [TimedRobot] []
    (robotInit [] (println "yay"))
    (robotPeriodic []
      (.run (CommandScheduler/getInstance)))
    (autonomousInit [] (println "yay"))
    (autonomousPeriodic [] (println "yay"))
    (teleopInit [] (println "yay"))
    (teleopPeriodic [] (println "yay"))))
