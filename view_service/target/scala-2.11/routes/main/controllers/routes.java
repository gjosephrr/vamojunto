
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/js/workspace/VamoJunto!/vamojunto/view_service/conf/routes
// @DATE:Fri Apr 22 15:03:17 BRT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseViewController ViewController = new controllers.ReverseViewController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseViewController ViewController = new controllers.javascript.ReverseViewController(RoutesPrefix.byNamePrefix());
  }

}
