https://www.youtube.com/watch?v=-wzl8XJopgg
https://www.youtube.com/watch?v=fPHVhlRFFCk&list=PLggLP4f-rq02vX0OQQ5vrCxbJrzamYDfx&index=89 
https://research.ijcaonline.org/volume113/number3/pxc3901586.pdf
https://ecam-eurobot.github.io/Tutorials/introduction.html
https://ecam-eurobot.github.io/Tutorials/software/mecanum/mecanum.html
https://github.com/Ecam-Eurobot/Eurobot-2018/blob/master/ros_packages/mecanum/src/mecanum.py

# Forward kinematics 

$$
\left\{\begin{matrix}
    v_x & = (\omega_{fl} + \omega_{fr} + \omega_{rl} + \omega_{rr}) \cdot \frac{r}{4}\\ 
    v_y & = (-\omega_{fl} + \omega_{fr} + \omega_{rl} - \omega_{rr}) \cdot \frac{r}{4}\\ 
    \omega_z & = (-\omega_{fl} + \omega_{fr} - \omega_{rl} + \omega_{rr}) \cdot \frac{r}{4(l_x + l_y)}
    \end{matrix}\right.
$$
# inverse kinematics
$$
\left\{\begin{matrix}
    \omega_{fl} &= \frac{1}{r} \left[v_x - v_y - (l_x + l_y)\omega_z \right ] \\ 
    \omega_{fr} &= \frac{1}{r} \left[v_x + v_y + (l_x + l_y)\omega_z \right ] \\ 
    \omega_{rl} &= \frac{1}{r} \left[v_x + v_y - (l_x + l_y)\omega_z \right ] \\ 
    \omega_{rr} &= \frac{1}{r} \left[v_x - v_y + (l_x + l_y)\omega_z \right ] 
    \end{matrix}\right.
$$
R is wheel radius