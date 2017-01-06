# cbf-dl - classifying CBF data using DL & NN

###1.0 An example of Rössler attractor-based time series discretization mutation
#![Rössler tesselation-based mutator example](https://raw.githubusercontent.com/SFI-CSSS2016/cbf-dl/master/RCode/tessellation_test01.png)

For this example a single Cylinder time series was 
-  discretized with SAX via sliding window
-  the resulting SAX words were concatenated into a single string
-  which was mapped onto the attractor's curve (`RosslerEquations(0.439, 1.99, 3.75)` starting at `{ 1., 1., 1. }`)
-  these are plotted with `cornflowerblue` colors

Next,
-  a new Rössler curve was generated with slightly different parameters (`RosslerEquations(0.440, 2.01, 3.74)` starting at `{ 0.99, 1., 1. }`)
- whose points were mapped into the letters (we used Voronoi tesselation to create polygons and the RTree to perform mapping), resulting in a new (_potential_) representative of the same Cylinder class time series in the discretized space ...
