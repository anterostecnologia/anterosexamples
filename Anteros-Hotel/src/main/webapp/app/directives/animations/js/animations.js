angular.module('animations', [])
  .directive('animatedFadeInUpBig', function(){
    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;
    ddo.template = '<div class="animated fadeInUpBig" ng-transclude></div>';
    return ddo;
  });
