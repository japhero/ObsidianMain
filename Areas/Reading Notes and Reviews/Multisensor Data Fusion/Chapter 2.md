
## Notes 

- What is multisensor data fusion
	- any time within the integration process where several sources of sensory information are turned into one result

- Data fusion has many issues among or more specifically different way that fusion algorithms deal with different types of noise or different failure modes. Some of those include algorithms not being able to handle spurious data, inconsistent data such as outliers, out of sequence data or conflicting data. The best example for this is the Kalman filter which although popular breaks down when exposed to outliers. 

### Covariance Union Algorithm
 error safe algorithm 


**Covariance (summary):** A matrix quantifying how much a set of variables vary and how they vary _together_. Diagonal entries = variance of each variable (spread/uncertainty); off-diagonal entries = correlation between pairs of variables. In sensor/estimation contexts, it describes the uncertainty of a reading across its error dimensions (e.g. x-error vs y-error), not a relation between separate readings over time. Used in Kalman filtering to weight how much to trust each data source when fusing them.


**Sources**
- [A Fast Covariance Union Algorithm for Inconsistent Sensor Data Fusion](https://ieeexplore.ieee.org/stamp/stamp.jsp?tp=&arnumber=9585120) 


### Questions
- What is data covariance?
	- Covariance is ==a statistical measure that shows how two variables move together==. If one variable goes up when the other goes up, they have a positive covariance. If one goes up when the other goes down, they have a negative covariance
- What is stocastic adaptive modeling 


