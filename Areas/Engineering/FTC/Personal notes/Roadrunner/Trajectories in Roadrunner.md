
# Dump

## Trajectories

## Actions 
- seems like a class containing the individual actions of 
- `runBlocking()` is whats called to run the actions 
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

- The QuickStart comes with a small set of actions to start from.
	- `SleepAction`: sleep for a duration
	- `SequentialAction`: execute a bunch of actions one after the other
	- `ParallelAction`: execute a bunch of actions at the same time
	- `FollowTrajectoryAction`: follow a trajectory (separate tank and mecanum versions)
	- `TurnAction`: turn in place (separate tank and mecanum versions)
- To create actions we implement an Action class with 2 methods
	- `public boolean run(TelemetryPacket packet)`
	- 

--- 
# Resources
https://rr.brott.dev/docs/v1-0/actions/