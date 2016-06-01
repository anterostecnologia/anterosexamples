angular.module('dark-alerts', [])
.directive('darkAlertInfo', function(){
  var ddo = {};

  ddo.restrict = "AE";
  ddo.transclude = true;

  ddo.template = '<div class="alert bg-info text-white" ng-transclude></div>';

  return ddo;
})
.directive('darkAlertDanger', function(){
  var ddo = {};

  ddo.restrict = "AE";
  ddo.transclude = true;

  ddo.template = '<div class="alert bg-danger text-white" ng-transclude></div>';

  return ddo;
})
.directive('darkAlertWarning', function(){
  var ddo = {};

  ddo.restrict = "AE";
  ddo.transclude = true;

  ddo.template = '<div class="alert bg-warning text-white" ng-transclude></div>';

  return ddo;
})
.directive('darkAlertSuccess', function(){
  var ddo = {};

  ddo.restrict = "AE";
  ddo.transclude = true;

  ddo.template = '<div class="alert bg-success text-white" ng-transclude></div>';

  return ddo;
});
