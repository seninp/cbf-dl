package net.seninp.attractor.rossler;

import java.util.ArrayList;
import org.apache.commons.math3.ode.sampling.FixedStepHandler;

public class RosslerStepHandler implements FixedStepHandler {

  private static final String TAB = "\t";

  private ArrayList<double[]> steps;
  private String fname;

  public RosslerStepHandler(String outFName, ArrayList<double[]> theCurve) {
    super();
    this.fname = outFName;

    this.steps = theCurve;
    this.steps.clear();
  }

  public void handleStep(double t, double[] y, double[] yDot, boolean isLast) {

    double[] arr = { t, y[0], y[1], y[2] };
    steps.add(arr);

//    if (isLast) {
//      try {
//        PrintWriter writer = new PrintWriter(new File(fname), "UTF-8");
//        for (double[] step : steps) {
//          writer.println(step[0] + TAB + step[1] + TAB + step[2] + TAB + step[3]);
//        }
//        writer.close();
//      }
//      catch (Exception e) {
//      }
//
//    }

  }

  public void init(double arg0, double[] arg1, double arg2) {
    // TODO Auto-generated method stub
    assert true;
  }

}
