#FTC #codeDocs #Engineering #FTC_Centerstage

# Structure 
The idea behind the code is that the main class `Robot2023` is a container for all of our teleop and auto functions  use rivers [Controller template](https://github.com/chsbacon/FTC-CENTERSTAGE-7080/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/modules/ControllerTemplate.java)

![[Robot 2023 structure diagram|800]]

every controller must have a `doLoop` and `opmodeinnit` Call



## Detection of team object and 3 paths
First on start check in what position the team object is store that location and then run the corresponding `runblocking` as documented in [[Trajectories in Roadrunner]] 




## TFOD vision 
[Rivers code](https://github.com/chsbacon/FTC-CENTERSTAGE-7080/blob/master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode/modules/TfodController.java)
(tensor flow object detection)


---

# Resources 
[[Trajectories in Roadrunner]]
[Bacon code TODO](https://github.com/orgs/chsbacon/projects/6)

