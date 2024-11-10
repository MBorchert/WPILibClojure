(ns frc.robot.core
  (:import [edu.wpi.first.wpilibj TimedRobot])
  (:import com.kauailabs.navx.frc.AHRS)
  (:import [edu.wpi.first.wpilibj2.command Command CommandScheduler])
  (:gen-class))

(defn make-robot
  []
  (proxy [TimedRobot] []
    (robotInit [] 
      (println "yay")
      (def ahrs (new AHRS)))

    (robotPeriodic []
      (.run (CommandScheduler/getInstance))
      (println (.getPitch ahrs)))
    (autonomousInit [] (println "yay"))
    (autonomousPeriodic [] (println "yay"))
    (teleopInit [] (println "yay"))
    (teleopPeriodic [] (println "yay"))))
