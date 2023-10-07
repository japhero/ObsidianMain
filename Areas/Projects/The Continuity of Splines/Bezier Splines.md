![Vid](https://youtu.be/jvPPXbo87ds?t=600)

# Dump 
- Splines are multiple [[Bezier Curves]] put together and sharing endpoints.
- $U$ is a new input  for [[Bezier Splines]] representative of the index of what [[Bezier Curves|Curve]] I'm in as well as the fractional representation. Similar to [[74. Search a 2D Matrix]] were the whole number was the first list index while the fraction was the percentage.
- <img src = "https://i.imgur.com/ADdsRlK.png" width =400>
- The input $U$ is in a one dimensional "parameter space"
- The points we define are called control points.
- A spline is then generated based on those control points.
- Each curve is its own function [10:54](https://youtu.be/jvPPXbo87ds?t=654)
- Knots are the connecting spots between 2 splines
- A uniform spline is where all knots have the same interval.
- ==The main difference in benefit in splines compared to [[Bezier Curves]] is that the control points effect  only the index of the adjacent section rather than the entire curve.== 
	- This is exemplified when using the concept of indexes as each control point has control over its own region. example if each spline has 2 control point meaning 2 per interval/(whole number) so every $\frac{1}{3}$ this would mean that control point  1 has control over 1 index while control point 3 would have effect on index 1 and index 2
- ![](https://i.imgur.com/L61h2Qr.png) Example of [[Bezier Splines]] [13:26](https://youtu.be/jvPPXbo87ds?t=806)
