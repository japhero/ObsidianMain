

## Terms to Know

Seeing a bunch of jargon thrown around and don't quite understand? Don't sweat it. We gotchu.

If you see some recurring jargon that doesn't show up on this page, hit me up on Discord (Noah#5396) and I'll be sure to add it! Or feel free to make a GitHub pull request!

### [Localization](https://learnroadrunner.com/before-you-start.html#localization)

You'll see the term localization thrown around throughout higher level FTC teams. Localization essentially just means the ability for your bot to know where you are at any point in time. Trying to get somewhere without knowing where you are is a difficult task (this is essentially the difference between closed and open loop control). Localization is generally done through odometry but can also take form in more exotic methods such as VSLAM (see the Intel Realsense T265 which can be found on some FTC bots). Using some form of odometry (drive encoders or external dead wheels) and feeding it into their respective kinematic equations then integrating allows one to determine the relative pose (x, y, heading) of the bot.

### [Motion Profile](https://learnroadrunner.com/before-you-start.html#motion-profile)

A motion profile is essentially just a graph of the behavior that something must follow to reach a certain state. In Road Runner's primary case, motion profiles are generated describing the velocity of the bot to reach a defined pose (although motion profiles can be generated for different components, like an elevator). But what we're concerned with is the bot's velocity graph. Motion profiling essentially maps out the entire movement that you need to take to get to a certain point. You can modify/control this graph by defining max velocity, max acceleration, etc. For a better explanation of motion profiling, check out [this link (opens new window)](https://www.motioncontroltips.com/what-is-a-motion-profile/). FRC Team 254 also has a [great conference talk (opens new window)](https://www.youtube.com/watch?v=8319J1BEHwM)on this.

### [Open vs Closed Loop Control](https://learnroadrunner.com/before-you-start.html#open-vs-closed-loop-control)

The difference between open and closed loop control is essentially just a matter of whether you have feedback or not. If you have feedback, you can "close the loop." What does feedback mean?

Let's take the FTC example of wanting to control the velocity of your motor. Let's start with open-loop control. Open-loop essentially means you're "guestimating" the value you need. You have an existing mathematical model of some components. And then you shove your value through that equation and hope that value works. So going back to our velocity control. Let's say you have a goBILDA 13.7:1 435 RPM motor. You want the motor to spin at 217.5 RPM. That's 50% speed. What you do is send 50% of the voltage to the motor right? So do a `motor.setPower(0.5)` which sends 6v (technically, not really. The motor speed is controlled with PWM but let's just pretend here) to the motor. However, this is the real world. That motor isn't going to go exactly 217.5 RPM. Due to physical tolerances, electrical noise, magic dust, etc, that motor will have a ±10% tolerance (according to goBILDA's own specs. Source: @ethan on the discord). Meaning, we send 6v to the motor but in reality that motor can be spinning anywhere from 174 to 261 RPM. Quite a big range! But this is the best open-loop control can give us. We just send a value and hope it works. We never actually know if it's running at the speed we desire.

What if we want to be more accurate? Say if you want a consistent velocity for your 2020-21 Ultimate Goal disc shooter. Or accurate motion profiling. Well, most FTC motors will have encoders built-in. This allows you to measure the position of the shaft. But, velocity can also be derived. We can use this velocity data to actively correct our voltage output. This is what is meant by "closing the loop." Having feedback from the encoder allows us to slightly tweak the voltage we output and lower it if the motor is going too fast or raise it if the motor is going too slow. This is often done through a PID controller, although fancier methods such as LQR do exist.

### [Vector2d](https://learnroadrunner.com/before-you-start.html#vector2d)

Represents a 2d vector: an X and Y coordinate.

```
// Create a vector at coordinates (x: 10, y: -5)
Vector2d myVector = new Vector2d(10, -5);
```

### [Pose2d](https://learnroadrunner.com/before-you-start.html#pose2d)

Represents a 2d robot pose: an X and Y coordinate, and a heading.

Generally, this represents the robot's position and the direction it faces. Remember that increasing the angle goes counter-clockwise, just like any unit circle you've learned about in trigonometry. Keep this in mind as the turn function will go counter-clockwise. Also, remember that any representation of an angle should be in radians. This is why we use the `Math.toRadians()` function to convert from degrees to radians.

```
// Create a pose at coordinates (x: 10, y: -5) facing 90 degrees
Pose2d myPose = new Pose2d(10, -5, Math.toRadians(90));
```

### Odometry
Odometry is the system of calculating a robots position based on sensors [[Road  Runner directory| Road Runner]] Is a type of odometry or a system of  calculating it. 