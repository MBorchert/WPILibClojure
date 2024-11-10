package frc.robot;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.TimedRobot;

public class Main {
    public static void main(String[] args) {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("[frc.robot.core]"));
        RobotBase.startRobot(() -> (TimedRobot)Clojure.var("frc.robot.core", "make-robot").invoke());
    }
}
