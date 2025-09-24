
# Dump

## Trajectories

## Actions 
- seems like a class containing the individual actions of action Class
- `runBlocking()` is whats called to run the actions is called run blocking because it runs a loop that blocks although it can be shut down.
```java
runBlocking(new SequentialAction(
    drive.turn(Math.PI / 2),
    new ParallelAction(
        drive.followTrajectory(shootingTraj),
        new SequentialAction(
            shooter.spinUp(),
            shooter.fireBall(),
        ),
    ),
));
```
- Run the SequentialAction to combine actions that are created
- Actions are the diffrent things we want to do 


### Structure example 

ArmClass
- Action: Open 
- Action: Close

Main/runBlocking
- Move somewhere 
- Sequencial action:
	- ArmClass.open
	- ArmClass.Close

- You can combine the action class with the Teleop to make it one module. 

- The QuickStart comes with a small set of actions to start from.
	- `SleepAction`: sleep for a duration
	- `SequentialAction`: execute a bunch of actions one after the other
	- `ParallelAction`: execute a bunch of actions at the same time
	- `FollowTrajectoryAction`: follow a trajectory (separate tank and mecanum versions)
	- `TurnAction`: turn in place (separate tank and mecanum versions)
- To create actions we implement an Action class with 2 methods
	- `public boolean run(TelemetryPacket packet)`
	- 

- `@` is "annotations"
- `@overide` overide's the `run` super method of the `Action` [[java interface|interface]].
- `@NonNull` 
	- https://stackoverflow.com/questions/13484202/how-to-use-nullable-and-nonnull-annotations-more-effectively
- [Java abstraction](https://www.w3schools.com/java/java_abstract.asp)
- 

> [!Example]- River action example
> 
> ```java
> public Action openClaw(){  // Method of the ArmController
>     return new Action() {  
>         @Override  //Overides the run method of Action 
>         public boolean run(@NonNull TelemetryPacket telemetryPacket) {  
>             robot.clawServo.setPosition(CLAW_OPEN);   
>             // This is were things happen
>             // telemetryPacket.addLine("Claw opened");   
>             return false;  
>         }  
>     };  
> }
> ```
> 


## [Example OpMode](https://learnroadrunner.com/trajectories.html#building-a-trajectory)
- [ ] [Builder Pattern](https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/) 
- the builder patern seeks to fix telescoping constructors or in other words the fact that given a cirtain amount of properties that are not all mandatory we dont  want to have to create an infinite amount of  constructors for all the properties.
- [ ] [method chain](https://www.geeksforgeeks.org/method-chaining-in-java-with-examples/) 
	- chain methods together inline by having all the methods return the used object and then calling a subsequent methon instead
``` java
new Example()
.thingone()
.thingtwo();
```

--- 
# Resources
[Actions docs](https://rr.brott.dev/docs/v1-0/actions/)
[javaDOc](https://rr.brott.dev/docs/v1-0-0-beta1/actions/javadoc/)




$$
\begin{array}{l} \\
\int_{-1}^1 \frac{e^{\tan^{-1}}}{1+y^2} \, dx  \\

\end{array}
$$