angular.module('basicAlerts', [])
  .directive('basicAlertInfo', function(){
    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.template = '<div class="alert alert-info" ng-transclude></div>';

    return ddo;
  })
  .directive('basicAlertDanger', function(){
    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.template = '<div class="alert alert-danger" ng-transclude></div>';

    return ddo;
  })
  .directive('basicAlertWarning', function(){
    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.template = '<div class="alert alert-warning" ng-transclude></div>';

    return ddo;
  })
  .directive('basicAlertSuccess', function(){
    var ddo = {};

    ddo.restrict = "AE";
    ddo.transclude = true;

    ddo.template = '<div class="alert alert-success" ng-transclude></div>';

    return ddo;
  });
  
